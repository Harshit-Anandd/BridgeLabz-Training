package com.annotations.todo;
public class ProjectFeatures {
    @Todo(task = "Implement JWT Auth", assignedTo = "Developer A", priority = "HIGH")
    public void authenticate() {}

    @Todo(task = "Refactor CSS", assignedTo = "Developer B")
    public void renderUI() {}
}
