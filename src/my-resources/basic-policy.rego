package gcr_scanner

test_severity(input_severity, expected_severity) {
	input_severity == expected_severity
}

deny_image {
  	test_severity(input.result[_].Severity, "CRITICAL")
    test_severity(input.result[_].Severity, "HIGH")
}

allow_image_with_warnings {
    startswith(input.result[_].Status, "Fixed")
    not deny_image
}

allow_image {
  	not deny_image
    not allow_image_with_warnings
}