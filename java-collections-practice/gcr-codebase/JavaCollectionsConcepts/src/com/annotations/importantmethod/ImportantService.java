package com.annotations.importantmethod;
public class ImportantService {
    @ImportantMethod
    public void processPayment() {
        System.out.println("Processing payment...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void pingServer() {
        System.out.println("Pinging server...");
    }
}
