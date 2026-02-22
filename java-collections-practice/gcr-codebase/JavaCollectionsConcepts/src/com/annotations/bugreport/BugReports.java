package com.annotations.bugreport;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface BugReports {
    BugReport[] value();
}
