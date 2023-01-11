#!/usr/bin/python

import sys
from operator import attrgetter
from csv import reader
from datetime import datetime
from report.run import Run
from report.commit import Commit
from report.language import Language
import chevron

timestamp = None
default_folders_location = "https://github.com/swagger-api/swagger-codegen-test/tree/main/out"

def multisort(xs, specs):
  for key, reverse in reversed(specs):
    xs.sort(key=attrgetter(key), reverse=reverse)
  return xs

def deserializeRun(row):
  row_content = row[0]
  cells = row_content.split('|')

  run = Run()
  run.v2_version = cells[0]
  run.v3_version = cells[1]
  run.codegen_version = cells[2]
  run.timestamp = datetime.strptime(cells[3], "%Y_%m_%d_%H_%M_%S")
  run.commit = cells[4]
  run.language = cells[5]
  run.job = cells[6]
  run.spec = cells[7]
  run.generate_outcome = cells[8]
  run.build_outcome = cells[9]
  run.spec_url = cells[10]
  run.is_success_generation = run.generate_outcome == "success"
  timestamp = run.timestamp.strftime("%Y_%m_%d_%H_%M_%S")
  run.generated_folder_link = default_folders_location + "/" + run.v2_version + "_" + run.v3_version + "/" + timestamp + "/" + run.language + "/" + run.job + "/" + run.spec
  return run


def generateReport(outFolder, newestSpecV2 = None, newestSpecV3 = None, oldestSpecV2 = None, oldestSpecV3 = None):
  global timestamp
  results_file = open(outFolder + "results.csv", "r")
  csv_reader = reader(results_file)

  index = 0

  suitesMap = dict()

  # iterate all runs
  for row in csv_reader:
    # skip header
    if index == 0:
      index = index + 1
      continue
    # get run
    run = deserializeRun(row)
    # identify "commit" (todo rename to suite) by timestamp
    if run.timestamp in suitesMap: # exists
      commit = suitesMap[run.timestamp]
    else: # doesn't exist, create
      commit = Commit()
      commit.languagesv2 = dict()
      commit.languagesv3 = dict()
      commit.commit = run.commit
      commit.short_hash = commit.commit[0:7]
      commit.timestamp = run.timestamp
      commit.v2_version = run.v2_version
      commit.v3_version = run.v3_version
      commit.runs = list()
      # add to suiteMap
      suitesMap[run.timestamp] = commit

    # append the current run to suite
    commit.runs.append(run)
    languagev2 = None
    languagev3 = None
    # setup languages for each suite
    if run.codegen_version == "v2":
      if run.language in commit.languagesv2: # use existing
        languagev2 = commit.languagesv2[run.language]
      else: # create new
        languagev2 = Language()
        languagev2.codegen_version = run.codegen_version
        languagev2.name = run.language
        commit.languagesv2[run.language] = languagev2
      languagev2.total_runs += 1
    else:
      if run.language in commit.languagesv3: # use existing
        languagev3 = commit.languagesv3[run.language]
      else: # create new
        languagev3 = Language()
        languagev3.codegen_version = run.codegen_version
        languagev3.name = run.language
        commit.languagesv3[run.language] = languagev3
      languagev3.total_runs += 1
    index += 1
  # sort by timestamp ascending
  suitesKeys = sorted(suitesMap.keys(), reverse = False)
  # suitesMap = dict(sorted(suitesMap.items(), None, True))
  # commits = sorted(commits, key=lambda sortCommit: sortCommit.timestamp)

  # todo now we mandate all 4 parameters, checking only the first
  suiteNew = None
  suiteOld = None

  if newestSpecV2 is not None:
    for suiteKey in suitesKeys:
      commit = suitesMap[suiteKey]
      print (str(suiteKey) + " " + commit.v2_version + " " + commit.v3_version)
      # todo we should be able to run probably separately v2 and v3 to be able to run and compare separately..
      if commit.v2_version == newestSpecV2:
        suiteNew = commit
      if commit.v2_version == oldestSpecV2:
        suiteOld = commit
    suitesMapFiltered = dict()
    suitesMapFiltered[suiteOld.timestamp] = suiteOld
    suitesMapFiltered[suiteNew.timestamp] = suiteNew
    suitesMap = suitesMapFiltered
    suitesKeys = suitesMap.keys()

  previous_commit = None
  for suiteKey in suitesKeys:
    commit = suitesMap[suiteKey]
    commit.runs = multisort(list(commit.runs), (('codegen_version', False), ('language', False)))
    commit.total_runs = len(commit.runs)

    for run in commit.runs:
      previous_run = None
      if previous_commit is not None:
        previous_run = run.find_match(previous_commit.runs)
      if run.generate_outcome != "success":
        run.generate_error = True
        commit.generate_error_count += 1
        if run.codegen_version == "v2":
          if run.language in commit.languagesv2: # use existing
            commit.languagesv2[run.language].generate_error_count += 1
        else:
          if run.language in commit.languagesv3: # use existing
            commit.languagesv3[run.language].generate_error_count += 1
        if previous_run is not None:
          if previous_run.generate_outcome == "success":
            commit.regression_count += 1
            run.is_regression = True
            if run.codegen_version == "v2":
              if run.language in commit.languagesv2: # use existing
                commit.languagesv2[run.language].regression_count += 1
            else:
              if run.language in commit.languagesv3: # use existing
                commit.languagesv3[run.language].regression_count += 1
      if run.build_outcome != "success":
        run.build_error = True
        if run.build_outcome == "failure":
          commit.build_failure_count += 1
          if run.codegen_version == "v2":
            if run.language in commit.languagesv2:
              commit.languagesv2[run.language].build_failure_count += 1
          else:
            if run.language in commit.languagesv3:
              commit.languagesv3[run.language].build_failure_count += 1
          if previous_run is not None:
            if previous_run.build_outcome == "success":
              commit.regression_count += 1
              run.is_regression = True
              if run.codegen_version == "v2":
                if run.language in commit.languagesv2:
                  commit.languagesv2[run.language].regression_count += 1
              else:
                if run.language in commit.languagesv3:
                  commit.languagesv3[run.language].regression_count += 1
        else:
          commit.build_error_count += 1
          if run.codegen_version == "v2":
            if run.language in commit.languagesv2: # use existing
              commit.languagesv2[run.language].build_error_count += 1
          else:
            if run.language in commit.languagesv3: # use existing
              commit.languagesv3[run.language].build_error_count += 1
          if previous_run is not None:
            if previous_run.build_outcome == "success":
              commit.regression_count += 1
              run.is_regression = True
              if run.codegen_version == "v2":
                if run.language in commit.languagesv2: # use existing
                  commit.languagesv2[run.language].regression_count += 1
              else:
                if run.language in commit.languagesv3: # use existing
                  commit.languagesv3[run.language].regression_count += 1
      else:
        if run.codegen_version == "v2" and run.language in commit.languagesv2:
            commit.languagesv2[run.language].successful_runs += 1
        elif run.codegen_version == "v3" and run.language in commit.languagesv3:
            commit.languagesv3[run.language].successful_runs += 1

    previous_commit = commit

  # sort by timestamp descending
  if newestSpecV2 is None:
    suitesKeys = sorted(suitesMap.keys(), reverse = True)
  else:
    suitesMapFiltered = dict()
    suitesMapFiltered[suiteNew.timestamp] = suiteNew
    suitesMapFiltered[suiteOld.timestamp] = suiteOld
    suitesMap = suitesMapFiltered
    suitesKeys = suitesMap.keys()

  commits = list()
  for suiteKey in suitesKeys:
    print ("SUITE " + str(suiteKey))
    commit = suitesMap[suiteKey]
    langKeysv2 = sorted(commit.languagesv2.keys(), reverse = False)
    langKeysv3 = sorted(commit.languagesv3.keys(), reverse = False)
    langsv2 = list()
    langsv3 = list()
    for langKeyv2 in langKeysv2:
      langsv2.append(commit.languagesv2[langKeyv2])
    commit.languagesv2 = multisort(list(langsv2), (('codegen_version', False), ('name', False)))
    for langKeyv3 in langKeysv3:
      langsv3.append(commit.languagesv3[langKeyv3])
    commit.languagesv3 = multisort(list(langsv3), (('codegen_version', False), ('name', False)))
    commits.append(commit)

  with open('index.mustache', 'r') as template:
    output = chevron.render(template, {'commits': commits})
    file = outFolder + "report_" + timestamp + ".html"
    if newestSpecV2 is not None:
      file = outFolder + "report_" + newestSpecV2 + "-" + newestSpecV3 + "_" + oldestSpecV2 + "-" + oldestSpecV3 + "_" + timestamp + ".html"
    result_file = open(file, "wt")
    result_file.write(output)
    result_file.close()

  with open('report.mustache', 'r') as template:
    output = chevron.render(template, {'commits': commits})
    file = outFolder + "report_" + timestamp + ".md"
    if newestSpecV2 is not None:
      file = outFolder + "report_" + newestSpecV2 + "-" + newestSpecV3 + "_" + oldestSpecV2 + "-" + oldestSpecV3 + "_" + timestamp + ".md"
    result_file = open(file, "wt")
    result_file.write(output)
    result_file.close()

# main
def main():
  global timestamp

  timestamp = datetime.now().strftime("%Y_%m_%d_%H_%M_%S")

  if len(sys.argv) > 3:
    generateReport("out/", sys.argv[1], sys.argv[2], sys.argv[3], sys.argv[4])
  else:
    generateReport("out/")

# here start main
main()
