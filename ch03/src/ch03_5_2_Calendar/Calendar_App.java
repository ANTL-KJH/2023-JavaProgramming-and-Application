package ch03_5_2_Calendar;

import java.util.Calendar;

public class Calendar_App {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        int weekday = now.get(Calendar.DAY_OF_WEEK);
        String[] weekDayName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.printf("Date (%4d-%02d-%02d, %s), Time(%02d:%02d:%02d)\n",
                year, month, day, weekDayName[weekday], hour, min, sec);
    }
}
