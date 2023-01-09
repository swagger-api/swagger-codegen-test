#!/usr/bin/python

import os
import sys
import time
import urllib.request, urllib.error, urllib.parse
import http.client
import base64
import json
import zipfile
from datetime import datetime

timestamp = None

GH_BASE_URL = "https://api.github.com/"

GH_USER = "swagger-api"
GH_EXECUTOR = ''
GH_TOKEN = ''
CODEGEN_VERSION_V2 = 'latest'
CODEGEN_VERSION_V3 = 'latest'

FULL_SCRIPT = True
# DATA_FILE = 'test-framework-data-oneeach-small.json'
# DATA_FILE = 'test-framework-data-js-v3-one.json'
DATA_FILE = 'test-framework-data-oneeach.json'

dataJson = None
sha = ''

def readUrl(name):
  global GH_BASE_URL
  global GH_EXECUTOR
  global GH_TOKEN

  try:
    data_bytes = str('%s:%s' % (GH_EXECUTOR, GH_TOKEN)).encode("utf-8")
    base64string = base64.b64encode(data_bytes).decode("utf-8")
    request = urllib.request.Request(GH_BASE_URL + name)
    request.add_header("Authorization", "Basic %s" % base64string)
    request.add_header("Accept", "application/vnd.github.v3+json")
    content = urllib.request.urlopen(request).read()
    jcont = json.loads(content)
    # clear file with exception count
    return jcont;
  except urllib.error.HTTPError as e:
    print('HTTPError = ' + str(e.code))
    return None
  except urllib.error.URLError as e:
    print('URLError = ' + str(e.reason))
    return None
  except http.client.HTTPException as e:
    print('HTTPException = ' + str(e))
    return None
  except Exception:
    import traceback
    print('generic exception: ' + traceback.format_exc())
    return None


def delete(name):
  global GH_BASE_URL
  global GH_EXECUTOR
  global GH_TOKEN

  try:
    print ("delete " + name)
    data_bytes = str('%s:%s' % (GH_EXECUTOR, GH_TOKEN)).encode("utf-8")
    base64string = base64.b64encode(data_bytes).decode("utf-8")
    request = urllib.request.Request(GH_BASE_URL + name)
    request.add_header("Authorization", "Basic %s" % base64string)
    request.get_method = lambda: 'DELETE'
    urllib.request.urlopen(request)
    return True
  except urllib.error.HTTPError as e:
    print (e.reason)
    print('HTTPError = ' + str(e.code))
    return False
  except urllib.error.URLError as e:
    print('URLError = ' + str(e.reason))
    return False
  except http.client.HTTPException as e:
    print('HTTPException = ' + str(e))
    return False
  except Exception:
    import traceback
    print('generic exception: ' + traceback.format_exc())
    return False


def downloadBin(url, name):
  global GH_BASE_URL
  global GH_EXECUTOR
  global GH_TOKEN

  try:
    data_bytes = str('%s:%s' % (GH_EXECUTOR, GH_TOKEN)).encode("utf-8")
    base64string = base64.b64encode(data_bytes).decode("utf-8")
    request = urllib.request.Request(GH_BASE_URL + url)
    request.add_header("Authorization", "Basic %s" % base64string)
    content = urllib.request.urlopen(request).read()
    local = open(name, 'wb')  # write binary to local file
    local.write(content)
    local.close()  # close file
    return True
  except urllib.error.HTTPError as e:
    print('HTTPError = ' + str(e.code))
    return False
  except urllib.error.URLError as e:
    print('URLError = ' + str(e.reason))
    return False
  except http.client.HTTPException as e:
    print('HTTPException = ' + str(e))
    return False
  except Exception:
    import traceback
    print('generic exception: ' + traceback.format_exc())
    return False


def postUrl(name, body):
  global GH_BASE_URL
  global GH_EXECUTOR
  global GH_TOKEN

  try:
    time.sleep(0.05)
    # data = urllib.urlencode(body)
    data_bytes = str('%s:%s' % (GH_EXECUTOR, GH_TOKEN)).encode("utf-8")
    base64string = base64.b64encode(data_bytes).decode("utf-8")
    request = urllib.request.Request(GH_BASE_URL + name)
    request.add_header("Authorization", "Basic %s" % base64string)
    content = urllib.request.urlopen(request, body.encode("utf-8")).read()
    jcont = json.loads(content)
    # clear file with exception count
    return jcont;
  except urllib.error.HTTPError as e:
    print('HTTPError = ' + str(e.code))
    print(str(e))
    return None
  except urllib.error.URLError as e:
    print('URLError = ' + str(e.reason))
    return None
  except http.client.HTTPException as e:
    print('HTTPException = ' + str(e))
    return None
  except Exception:
    import traceback
    print('generic exception: ' + traceback.format_exc())
    return None


def postUrlNoContent(name, body):
  global GH_BASE_URL
  global GH_EXECUTOR
  global GH_TOKEN

  try:
    time.sleep(0.05)
    # data = urllib.urlencode(body)
    data_bytes = str('%s:%s' % (GH_EXECUTOR, GH_TOKEN)).encode("utf-8")
    base64string = base64.b64encode(data_bytes).decode("utf-8")
    request = urllib.request.Request(GH_BASE_URL + name)
    request.add_header("Authorization", "Basic %s" % base64string)
    urllib.request.urlopen(request, body.encode("utf-8")).read()
    return True
  except urllib.error.HTTPError as e:
    print('HTTPError = ' + str(e.code))
    print(str(e))
    return False
  except urllib.error.URLError as e:
    print('URLError = ' + str(e.reason))
    return False
  except http.client.HTTPException as e:
    print('HTTPException = ' + str(e))
    return False
  except Exception:
    import traceback
    print('generic exception: ' + traceback.format_exc())
    return False

def postUrlNoBodyNoContent(name):
  global GH_BASE_URL
  global GH_EXECUTOR
  global GH_TOKEN

  try:
    time.sleep(0.05)
    data_bytes = str('%s:%s' % (GH_EXECUTOR, GH_TOKEN)).encode("utf-8")
    base64string = base64.b64encode(data_bytes).decode("utf-8")
    request = urllib.request.Request(GH_BASE_URL + name)
    request.get_method = lambda: 'POST'
    request.add_header("Authorization", "Basic %s" % base64string)
    urllib.request.urlopen(request).read()
    return True
  except urllib.error.HTTPError as e:
    print('HTTPError = ' + str(e.code))
    print(str(e))
    return False
  except urllib.error.URLError as e:
    print('URLError = ' + str(e.reason))
    return False
  except http.client.HTTPException as e:
    print('HTTPException = ' + str(e))
    return False
  except Exception:
    import traceback
    print('generic exception: ' + traceback.format_exc())
    return False

# pretty
def pretty(jcont):
  return json.dumps(jcont, sort_keys=True, indent=4, separators=(',', ': '))


def allArtifacts(page, allcontent):
  global GH_USER
  url = 'repos/' + GH_USER + '/swagger-codegen/actions/artifacts?page=' + str(page)
  count = 0
  content = readUrl(url)
  while content is None  and count < 5:
    count += 1
    print('error allArtifacts ' + url)
    content = readUrl(url)
  if allcontent is None:
    allcontent = content
  else:
    allcontent['artifacts'].extend(content['artifacts'])
  if allcontent['total_count'] > 30 * page:
    return allArtifacts(page+1, allcontent);

  print ('allArtifacts (' + str(page) + ') - returned total_count: ' + str(allcontent['total_count']))
  return allcontent




def allWorkflows(page, allcontent):
  global GH_USER
  print ('allWorkflows (' + page + ')')
  url = 'repos/' + GH_USER + '/swagger-codegen/actions/workflows?page=' + str(page)
  count = 0
  content = readUrl(url)
  while content is None  and count < 5:
    count += 1
    print('error allWorkflows ' + url)
    content = readUrl(url)

  if allcontent is None:
    allcontent = content
  else:
    allcontent['workflows'].extend(content['workflows'])
  print ('allWorkflows (' + page + ') - total_count: ' + str(allcontent['total_count']))
  if allcontent['total_count'] > 30 * page:
    return allWorkflows(page+1, allcontent);

  print ('allWorkflows (' + page + ') - returned total_count: ' + str(allcontent['total_count']))
  return allcontent

#print(json.dumps(content, indent=2, sort_keys=True))
  # allWorkflows(page+1)


def downloadArtifact(id, name):
  global GH_USER
  url = 'repos/' + GH_USER + '/swagger-codegen/actions/artifacts/' + str(id) + '/zip'
  print('attempting download of artifact ' + url + ' - ' + name)
  count = 0
  result = downloadBin(url, name)
  while not result and count < 5:
    count += 1
    print('error downloading bin ' + url + ' - ' + name)
    result = downloadBin(url, name)
  if result:
    print('downloaded artifact ' + url + ' - ' + name)
  else:
    print('ERROR: NOT downloaded artifact ' + url + ' - ' + name)
  return result


def deleteArtifact(id):
  global GH_USER
  print ('deleteArtifact ' + str(id))
  url = 'repos/' + GH_USER + '/swagger-codegen/actions/artifacts/' + str(id)
  delete(url)
  count = 0
  while not delete(url) and count < 5:
    count += 1
    print('error deleteArtifact ' + url)


def deleteAllArtifacts():
  global GH_USER
  print ('deleteAllArtifacts')
  artifacts = allArtifacts(1, None)
  print ('deleteAllArtifacts - allArtifacts total_count: ' + str(artifacts['total_count']))
  deleteCount = 0;
  for a in artifacts['artifacts']:
    deleteCount += 1
    id = a['id']
    deleteArtifact(id)

  print ('deleteAllArtifacts - deleteCount: ' + str(deleteCount))

def analyzeResult(outFolder, timestamp):
  global sha
  global CODEGEN_VERSION_V2
  global CODEGEN_VERSION_V3

  sheet = ''
  header = 'v2Version|v3Version|codegenVersion|timestamp|commit|language|job|spec|generate outcome|build outcome|spec url\n'

  dir = outFolder + CODEGEN_VERSION_V2 + "_" + CODEGEN_VERSION_V3 + "/" + timestamp

  langDirs = os.listdir(dir)
  for langDir in langDirs:
    if langDir == 'result.csv':
      continue
    langDirAbs = dir + "/" + langDir
    for jobDir in os.listdir(langDirAbs):
      codgenVersion = getCodegenVersion(jobDir)
      jobDirAbs = langDirAbs + "/" + jobDir
      for specDir in os.listdir(jobDirAbs):
        specDirAbs = jobDirAbs + "/" + specDir
        line = CODEGEN_VERSION_V2 + "|" + CODEGEN_VERSION_V3 + "|" + codgenVersion + "|" + timestamp + "|" + sha + "|" + langDir + "|" + jobDir + "|" + specDir + "|"
        if os.path.isfile(specDirAbs + "/build_outcome/build_outcome"):
          with open(specDirAbs + "/build_outcome/build_outcome", 'r') as file:
            buildOutcome = file.read().strip()
        else:
          buildOutcome = "error"
        if os.path.isfile(specDirAbs + "/generate_outcome/generate_outcome"):
          with open(specDirAbs + "/generate_outcome/generate_outcome", 'r') as file:
            generateOutcome = file.read().strip()
        else:
          generateOutcome = "error"

        specUrl = dataJson['specUrls'][codgenVersion][specDir]
        specUrl = specUrl.replace('{$GH_USER}', GH_USER)

        line +=  generateOutcome + "|" + buildOutcome + "|" + specUrl + "\n"
        sheet += line

  result_file = open(dir + "/" + "result.csv", "wt")
  result_file.write(header + sheet)
  result_file.close()

  if not os.path.isfile(outFolder + "results.csv"):
    sheet = header + sheet

  results_file = open(outFolder + "results.csv", "a")
  results_file.write(sheet)
  results_file.close()

def downloadArtifacts():
  global GH_USER
  global CODEGEN_VERSION_V2
  global CODEGEN_VERSION_V3
  global dataJson
  global timestamp

  outDir = "out"
  if not os.path.exists(outDir):
    os.makedirs(outDir)

  outVersionDir = "out/" + CODEGEN_VERSION_V2 + "_" + CODEGEN_VERSION_V3
  if not os.path.exists(outVersionDir):
    os.makedirs(outVersionDir)

  timestampDir = outVersionDir + "/" + timestamp
  if not os.path.exists(timestampDir):
    os.makedirs(timestampDir)

  artifacts = allArtifacts(1, None)
  for a in artifacts['artifacts']:
    try:
      id = a['id']
      name = a['name']
      if name == 'codegen-cli':
        continue
      # print id
      # time.sleep(0.5)
      # split name, expected format jobName___specId___artifacttype
      parts = name.split("___")
      jobName = parts[0]
      specId = parts[1]
      type = parts[2]

      if not jobName in dataJson['runs']:
        continue

      # first is name, check from config what is it
      job = dataJson['runs'][jobName]
      language = job['language']
      languageDir = timestampDir + "/" + language
      jobDir = languageDir + "/" + jobName
      specDir = jobDir + "/" + specId
      # create right javascript/js-v3-petstore/petstore3
      if not os.path.exists(languageDir):
        os.makedirs(languageDir)
      if not os.path.exists(jobDir):
        os.makedirs(jobDir)
      if not os.path.exists(specDir):
        os.makedirs(specDir)
      # download and extract
      if downloadArtifact(id, specDir + "/" + type + ".zip"):
        extractZip(specDir + "/" + type + ".zip", specDir + "/" + type, type)
    except Exception:
      import traceback
      print('downloadArtifacts exception: ' + traceback.format_exc())


def extractZip(path, outDir, type):
  try:
    with zipfile.ZipFile(path, 'r') as zip_ref:
      zip_ref.extractall(outDir)
    os.remove(path)
    if type != 'generated':
      os.rename(outDir + "/" + os.listdir(outDir)[0], outDir + "/" + type)
  except Exception:
    import traceback
    print('extractZip exception: ' + traceback.format_exc())




def downloadArtifactsOld():
  global GH_USER

  outDir = "out"
  if not os.path.exists(outDir):
    os.makedirs(outDir)

  artifacts = allArtifacts(1, None)
  for a in artifacts['artifacts']:
    id = a['id']
    name = a['name']
    if name == 'codegen-cli':
      continue
    # print id
    # time.sleep(0.5)
    downloadArtifact(id, outDir + "/" + name + ".zip")

def runSingleWorkflow(name, branch, language, specUrl, jobName, options, buildCommands, v):
  global GH_USER
  global CODEGEN_VERSION_V2
  global CODEGEN_VERSION_V3
  codegenVersion = CODEGEN_VERSION_V2
  if v == 'v3':
    codegenVersion = CODEGEN_VERSION_V3
  url = 'repos/' + GH_USER + '/swagger-codegen/actions/workflows/' + name + '/dispatches'

  payload = "{\"ref\":\"" + branch + "\", "
  payload += "\"inputs\": { "
  payload += "\"language\":" + json.dumps(language) + ", "
  payload += "\"specUrl\":" + json.dumps(specUrl) + ", "
  payload += "\"jobName\":" + json.dumps(jobName) + ", "
  payload += "\"options\":" + json.dumps(options) + ", "
  payload += "\"version\":" + json.dumps(codegenVersion) + ", "
  payload += "\"buildCommands\":" + json.dumps(buildCommands)
  payload += "}}"
  postUrlNoContent(url, payload)


def runWorkflows():
  global GH_USER
  print ("runWorkflows")
  v2Count = 0
  v3Count = 0
  for s in dataJson['specUrls']['v2']:
    specId = s
    specUrl = dataJson['specUrls']['v2'][s]
    specUrl = specUrl.replace('{$GH_USER}', GH_USER)
    for r in dataJson['runs']:
      if dataJson['runs'][r]['version'] != 'v2':
        continue
      jobName = r + "___" + specId + "___"
      builder = dataJson['runs'][r]['builder']
      options = dataJson['runs'][r]['options']
      language = dataJson['runs'][r]['language']
      workflow = dataJson['runs'][r]['workflow']
      if workflow == "TODO":
        print("skipping job: '" + jobName + "'. No workflow defined yet. ")
        continue
      buildCommands = "__&&__".join(dataJson['runs'][r]['buildCommands'])

      if "include" in dataJson['runs'][r]:
        if s in dataJson['runs'][r]["include"]:
          print("running " + workflow + ", job " + jobName + ", spec: " + specUrl)
          v2Count += 1
          runSingleWorkflow(workflow, "master", language, specUrl, jobName, options, buildCommands, 'v2')
        continue

      if "exclude" in dataJson['runs'][r] and s in dataJson['runs'][r]["exclude"]:
          continue

      print("running " + workflow + ", job " + jobName + ", spec: " + specUrl)
      v2Count += 1
      runSingleWorkflow(workflow, "master", language, specUrl, jobName, options, buildCommands, 'v2')

  for s in dataJson['specUrls']['v3']:
    specId = s
    specUrl = dataJson['specUrls']['v3'][s]
    specUrl = specUrl.replace('{$GH_USER}', GH_USER)
    for r in dataJson['runs']:
      if dataJson['runs'][r]['version'] != 'v3':
        continue
      jobName = r + "___" + specId + "___"
      builder = dataJson['runs'][r]['builder']
      options = dataJson['runs'][r]['options']
      language = dataJson['runs'][r]['language']
      workflow = dataJson['runs'][r]['workflow']
      if workflow == "TODO":
        print("skipping job: '" + jobName + "'. No workflow defined yet. ")
        continue
      buildCommands = "__&&__".join(dataJson['runs'][r]['buildCommands'])

      if "include" in dataJson['runs'][r]:
        if s in dataJson['runs'][r]["include"]:
          print("running " + workflow + ", job " + jobName + ", spec: " + specUrl)
          v3Count += 1
          runSingleWorkflow(workflow, "3.0.0", language, specUrl, jobName, options, buildCommands, 'v3')
        continue

      if "exclude" in dataJson['runs'][r] and s in dataJson['runs'][r]["exclude"]:
          continue

      print("running " + workflow + ", job " + jobName + ", spec: " + specUrl)
      v3Count += 1
      runSingleWorkflow(workflow, "3.0.0", language, specUrl, jobName, options, buildCommands, 'v3')
  print ("runWorkflows - v2 count: " + str(v2Count) + ", v3Count: " + str(v3Count))


def allRuns(page, workflow, allcontent):
  global GH_USER
  url = 'repos/' + GH_USER + '/swagger-codegen/actions/workflows/' + workflow +  '/runs?page=' + str(page)
  count = 0
  content = readUrl(url)
  while content is None and count < 5:
    count += 1
    print('error allRuns ' + url)
    content = readUrl(url)
  if content is None:
    if allcontent is not None:
      print ("allRuns CONTENT NONE - page: " + str(page) + ", workflow: " + workflow + ", total: " + str(allcontent['total_count']))
    else:
      print ("allRuns CONTENT NONE ALLCONTENT NONE- page: " + str(page) + ", workflow: " + workflow)
    return allcontent
  if allcontent is None:
    allcontent = content
  else:
    allcontent['workflow_runs'].extend(content['workflow_runs'])
  if allcontent['total_count'] > 30 * page:
    print("running again allRuns")
    return allRuns(page+1, workflow, allcontent);

  print ("allRuns - page: " + str(page) + ", workflow: " + workflow + ", total: " + str(allcontent['total_count']))
  #print(json.dumps(content, indent=2, sort_keys=True))
  return allcontent


def deleteRun(id):
  global GH_USER
  print ("deleteRun - id: " + str(id))
  url = 'repos/' + GH_USER + '/swagger-codegen/actions/runs/' + str(id)
  if not delete(url):
    print ('trying canceling run ' + str(id))
    if postUrlNoBodyNoContent(url + '/cancel'):
      print ('succeeded canceling run ' + str(id))
      time.sleep(1)
      print ('trying again deleting run ' + str(id))
      if not delete(url):
        print ('failed again deleting run ' + str(id))


def deleteAllRuns():
  global GH_USER
  global dataJson
  global sha
  print ('deleteAllRuns')
  deleteRunsCount = 0
  for wf in dataJson['workflows']:
    runs = allRuns(1, wf, None)
    for r in runs['workflow_runs']:
      id = r['id']
      # print id
      # time.sleep(0.5)
      deleteRunsCount += 1
      deleteRun(id)
  print ('deleteAllRuns - deleted count: ' + str(deleteRunsCount))

def getRunsCount():
  global GH_USER
  global dataJson
  active = 0
  for wf in dataJson['workflows']:
    runs = allRuns(1, wf, None)
    active += runs['total_count']

  return active

def getRunningRunsCount():
  global GH_USER
  global dataJson
  global sha
  active = 0
  for wf in dataJson['workflows']:
    runs = allRuns(1, wf, None)
    for r in runs['workflow_runs']:
      if r['status'] != 'completed':
        active += 1

      if sha == '' and "head_sha" in r:
        sha = r["head_sha"]
        print(sha)
  return active

def testFramework():
  global dataJson
  global timestamp
  global FULL_SCRIPT

  if FULL_SCRIPT:
    print("delete all runs")
    deleteAllRuns()
    # wait until all runs and artifacts are deleted
    print("waiting until all runs and artifacts are deleted..")
    time.sleep(5)
    runsCount = getRunsCount()
    waitCount = 0
    while runsCount > 0:
      if waitCount > 8:
        print("Trying again deleting all runs")
        deleteAllRuns()
        time.sleep(5)
        waitCount = 0
        runsCount = getRunsCount()
        continue
      print("runs count: " + str(runsCount) + ". wait more until all runs and artifacts are deleted..")
      waitCount += 1
      time.sleep(5)
      runsCount = getRunsCount()

    print("start running workflows")
    time.sleep(10)
    runWorkflows()
  # wait until all workflows are completed
  print("waiting until all workflows are completed..")
  time.sleep(30)
  runsCount = getRunningRunsCount()
  while runsCount > 0:
    print("runs count: " + str(runsCount) + ". waiting more until all workflows are completed..")
    time.sleep(5)
    runsCount = getRunningRunsCount()
  print("sleeping before downloading artifacts..")
  time.sleep(10)
  print("downloading artifacts")
  downloadArtifacts();
  print("analyzing results")
  analyzeResult('out/', timestamp)
  print("finished")

def testFrameworkAlreadyRunning():
  global dataJson
  global timestamp

  # wait until all workflows are completed
  print("waiting until all workflows are completed..")
  time.sleep(30)
  runsCount = getRunningRunsCount()
  while runsCount > 0:
    print("runs count: " + str(runsCount) + ". waiting more until all workflows are completed..")
    time.sleep(5)
    runsCount = getRunningRunsCount()
  print("sleeping before downloading artifacts..")
  time.sleep(10)
  print("downloading artifacts")
  downloadArtifacts();
  print("analyzing results")
  analyzeResult('out/', timestamp)
  print("finished")


def isBlank (myString):
  if myString and myString.strip():
    return False
  return True

def getCodegenVersion(job):
  global dataJson
  try:
    return dataJson['runs'][job]['version']
  except Exception:
    import traceback
    print('getCodegenVersion exception: ' + job + ' - ' + traceback.format_exc())
    return 'error'

def find_duplicated_keys(run_keys, data):
  duplicated_keys = list()

  for run_key in run_keys:
    index = data.find("\"" + run_key + "\":", 0)
    if index == -1:
      # this makes no sense here
      continue
    index = data.find("\"" + run_key + "\":", index + 1)
    if index == -1:
      # make sense :/
      continue
    # this guy is repeated
    duplicated_keys.append(run_key)

  return duplicated_keys


# main
def main():
  global dataJson
  global timestamp
  global GH_EXECUTOR
  global GH_USER
  global GH_TOKEN
  global CODEGEN_VERSION_V2
  global CODEGEN_VERSION_V3
  global FULL_SCRIPT
  global DATA_FILE

  GH_EXECUTOR = os.environ.get('GH_EXECUTOR')
  GH_TOKEN = os.environ.get('GH_TOKEN')
  GH_USER = os.environ.get('GH_USER')
  if isBlank(GH_USER):
    GH_USER = "swagger-api"
  if isBlank(GH_EXECUTOR):
    GH_EXECUTOR = sys.argv[1]
  if isBlank(GH_TOKEN):
    GH_TOKEN = sys.argv[2]
  if len(sys.argv) > 3:
    CODEGEN_VERSION_V2 = sys.argv[3]
  if len(sys.argv) > 4:
    CODEGEN_VERSION_V3 = sys.argv[4]
  if len(sys.argv) > 5:
    FULL_SCRIPT = sys.argv[5] == 'True'
  if len(sys.argv) > 6:
    DATA_FILE = sys.argv[6]

  timestamp = datetime.now().strftime("%Y_%m_%d_%H_%M_%S")

  #with open('test-framework-data-oneeach.json', 'r') as file:
  with open(DATA_FILE, 'r') as file:
    data = file.read()
  dataJson = json.loads(data)

  run_keys = list(dataJson["runs"])
  duplicated_keys = find_duplicated_keys(run_keys, data)
  duplicated_keys_count = len(duplicated_keys)
  if (duplicated_keys_count > 0):
    print("Some run keys are duplicated:")
    print(duplicated_keys)
    exit(0)

  #print getRunningRunsCount()
  testFramework()

  #testFrameworkAlreadyRunning()

  # functions tests
  # allArtifacts(1, None)
  # downloadArtifacts()
  # deleteArtifact(26001182)
  # deleteAllArtifacts()
  # downloadArtifact(26001182, 'test.zip')
  # allWorkflows(1, None)
  # allRuns(1)
  # deleteAllRuns()
  # runSingleWorkflow ("test-framework-single.yml", "test-framework", "javascript", "https://petstore3.swagger.io/api/v3/openapi.json", "js-v3-petstore", " -DappName=PetstoreClient --additional-properties useES6=false")
  # runWorkflows()
  # deleteAllRuns()
  # analyzeResult('/dati/dev/progetti/swagger/test-framework/out/2020_11_15_11_50_46')


# here start main
main()
