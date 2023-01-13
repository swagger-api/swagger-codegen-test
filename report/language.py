class Language:

    def __init__(self, name=None, codegen_version=None, generate_error_count=0, build_error_count=0, build_failure_count=0, regression_count=0):
        self.name = name
        self.codegen_version = codegen_version
        self.successful_runs = 0
        self.total_runs = 0
        self.generate_error_count = generate_error_count
        self.build_error_count = build_error_count
        self.build_failure_count = build_failure_count
        self.regression_count = regression_count
