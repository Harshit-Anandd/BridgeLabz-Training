package com.functionalinterfaces.dateformat;
import java.time.LocalDate;

public class DateMain {

    public static void main(String[] args) {
        System.out.println(
            DateUtil.format(LocalDate.now())
        );
    }
}
