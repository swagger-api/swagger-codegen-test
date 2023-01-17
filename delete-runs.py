#!/usr/bin/python

from multiprocessing.dummy import Pool as ThreadPool
import requests

TOKEN = ""
OWNER_REPO = "swagger-api/swagger-codegen"
DELETE_TARGET_RUN_NAME = "Test Framework JS"

headers = {
  "Accept": "application/vnd.github+json",
  "Authorization": "Bearer " + TOKEN,
}

PER_PAGE = 100


def list_all_runs(owner_repo):
  url = "https://api.github.com/repos/" + owner_repo + "/actions/runs"

  url_with_params = url + "?per_page=1"
  total_count = requests.get(url, headers=headers).json()["total_count"]
  page_count = total_count // PER_PAGE + 1
  print("total_count: ", total_count)

  def _list_runs_by_page(page):
    url_with_params = url + "?page="+ str(page) + "&per_page=" + str(PER_PAGE)
    runs_list = requests.get(url_with_params, headers=headers).json()
    page_workflow_runs = runs_list["workflow_runs"]

    return page_workflow_runs

  merged_workflow_runs = []
  with ThreadPool(10) as p:
    merged_workflow_runs = p.map(_list_runs_by_page, range(1, page_count + 1))

  return [run for runs in merged_workflow_runs for run in runs]


def filter_runs_by_name(runs_list, name):
  filtered_runs = [run for run in runs_list if run["name"] == name]
  return filtered_runs


def remove_runs(owner_repo, runs_list):
  def remove_run_by_id(run_id):
    url = "https://api.github.com/repos/" + owner_repo + "/actions/runs/" + str(run_id)
    requests.delete(url, headers=headers)

  with ThreadPool(10) as p:
    p.map(remove_run_by_id, [run["id"] for run in runs_list])

  print("removed runs: ", len(runs_list))


def main():
  runs = list_all_runs(OWNER_REPO)
  # delete_target_runs = filter_runs_by_name(runs, DELETE_TARGET_RUN_NAME)
  # remove_runs(OWNER_REPO, delete_target_runs)
  remove_runs(OWNER_REPO, runs)


if __name__ == "__main__":
  main()

