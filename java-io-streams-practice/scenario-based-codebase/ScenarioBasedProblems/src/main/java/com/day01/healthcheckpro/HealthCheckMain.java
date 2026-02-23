package com.day01.healthcheckpro;

public class HealthCheckMain {
    public static void main(String[] args){
        ApiScannerService service = new ApiScannerService();
        service.scan(LabController.class);
    }
}