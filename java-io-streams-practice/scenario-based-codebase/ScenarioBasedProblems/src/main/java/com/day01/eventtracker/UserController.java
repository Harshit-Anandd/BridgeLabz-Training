package com.day01.eventtracker;

public class UserController {
    @AuditTrail(action="User Login")
    public void login(){}
    @AuditTrail(action="File Upload")
    public void upload(){}
}
