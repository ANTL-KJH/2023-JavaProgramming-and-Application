package ch03_4_1_LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_LocalTime_App {
    public static void main(String[] args) {
        LocalDate ldate = LocalDate.now();
        System.out.println("Current date = " + ldate);
        LocalTime ltime = LocalTime.now();
        System.out.println("Current time = " + ltime);
        LocalDateTime l_date_time = LocalDateTime.now();
        System.out.println("Current date_time (before formatting) = " + l_date_time);
        DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = l_date_time.format(dtFormatter);
        System.out.println("Current date_time (after formatting) = " + formattedDateTime);
    }
}