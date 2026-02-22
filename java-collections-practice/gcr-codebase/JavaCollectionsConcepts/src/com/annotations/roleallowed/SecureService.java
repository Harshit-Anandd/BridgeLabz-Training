package com.annotations.roleallowed;
public class SecureService {
    @RoleAllowed("ADMIN")
    public void deleteDatabase() {
        System.out.println("Success: Database deleted.");
    }

    @RoleAllowed("USER")
    public void viewProfile() {
        System.out.println("Success: Profile viewed.");
    }
}
