package com.kar.practice.exercise.strings.src;

import java.time.LocalDate;

public class CalenderClass {
    public static void main(String[] args) {
        int month = 8;
        int day = 31;
        int year = 2022;

        String result = findDay(month, day, year);
        System.out.println(result);
    }
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);

        return String.valueOf(date.getDayOfWeek());
    }
}
