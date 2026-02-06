package com.functionalinterfaces.dataserialization;

public class BackupProcessor {

    public static void main(String[] args) {

        CustomerRecord record = new CustomerRecord("Alice");

        // Marker interface detection
        if (record instanceof BackupEligible) {
            System.out.println("Backing up record of: " +
                               record.getName());
        } else {
            System.out.println("Record not eligible for backup.");
        }
    }
}
