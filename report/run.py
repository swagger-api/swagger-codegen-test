class Run:

    def __init__(self, commit=None, timestamp=None, language=None, job=None, spec=None, generate_outcome=None, build_outcome=None, generate_error=None, build_error=None, is_regression=None, codegen_version=None, v2_version=None, v3_version=None, spec_url=None, generated_folder_link=None):
        self.commit = commit
        self.timestamp = timestamp
        self.language = language
        self.job = job
        self.spec = spec
        self.generate_outcome = generate_outcome
        self.build_outcome = build_outcome
        self.generate_error = generate_error
        self.build_error = build_error
        self.is_regression = is_regression
        self.is_success_generation = None
        self.codegen_version = codegen_version
        self.v2_version = v2_version
        self.v3_version = v3_version
        self.spec_url = spec_url
        self.generated_folder_link = generated_folder_link

    def find_match(self, runs):
        for run in runs:
            if self.language == run.language and self.job == run.job and self.spec == run.spec and self.codegen_version == run.codegen_version:
                return run
        return None
