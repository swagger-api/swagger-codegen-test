class Commit:

    def __init__(self, commit=None, timestamp=None, runs=None, generate_error_count=0, build_error_count=0, build_failure_count=0, regression_count=0, languagesv2=None, languagesv3=None, v2_version=None, v3_version=None):
        self.commit = commit
        self.timestamp = timestamp
        self.runs = runs
        self.total_runs = 0
        self.generate_error_count = generate_error_count
        self.build_error_count = build_error_count
        self.build_failure_count = build_failure_count
        self.regression_count = regression_count
        self.languagesv2 = languagesv2
        self.languagesv3 = languagesv3
        self.v2_version = v2_version
        self.v3_version = v3_version
