package com.annotations.bugreport;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
public @interface BugReport {
    String description();
}
