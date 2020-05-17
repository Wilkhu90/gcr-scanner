package io.jenkins.plugins.gcr_scanner;

public class ScanOutput {
    private String CVE;
    private String Package;
    private String Version;
    private String Severity;
    private String Status;

    public ScanOutput() {}

    public ScanOutput(String CVE, String aPackage, String version, String severity, String status) {
        this.CVE = CVE;
        Package = aPackage;
        Version = version;
        Severity = severity;
        Status = status;
    }

    public String getCVE() {
        return CVE;
    }

    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    public String getPackage() {
        return Package;
    }

    public void setPackage(String aPackage) {
        Package = aPackage;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String version) {
        Version = version;
    }

    public String getSeverity() {
        return Severity;
    }

    public void setSeverity(String severity) {
        Severity = severity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
