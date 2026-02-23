package com.day01.healthcheckpro;

public class LabController {
    @PublicAPI(description="Get Lab Results")
    public void getResults(){}
    @PublicAPI(description="Upload Report")
    @RequiresAuth(role="ADMIN")
    public void uploadReport(){}
}
