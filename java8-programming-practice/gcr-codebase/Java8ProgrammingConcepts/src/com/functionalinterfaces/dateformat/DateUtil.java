package com.functionalinterfaces.dateformat;
import java.time.LocalDate;

public interface DateUtil {

    static String format(LocalDate date) {
        return date.toString();
    }
}
