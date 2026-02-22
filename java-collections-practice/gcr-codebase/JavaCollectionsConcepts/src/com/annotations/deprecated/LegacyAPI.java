package com.annotations.deprecated;
public class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("[WARNING] Executing old feature. This is deprecated and might be removed soon.");
    }

    public void newFeature() {
        System.out.println("[SUCCESS] Executing new, optimized feature.");
    }
}
