package com.annotations.deprecated;
public class LegacyLogic {
    private LegacyAPI api = new LegacyAPI();

    public void executeFeature(int choice) {
        if (choice == 1) {
            api.oldFeature(); // Compiler warning expected here
        } else if (choice == 2) {
            api.newFeature();
        } else {
            System.out.println("Invalid selection.");
        }
    }
}
