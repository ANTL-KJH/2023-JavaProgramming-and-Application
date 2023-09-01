package ch03_2_5_class_Date;

import java.time.LocalDate;
import java.time.ZoneId;

public class Date_App {
    public static void main(String[] args)
    {
        Date AD010101 = new Date(1, 1, 1);
        int year, month, day;
        int daysToChristmas;
        LocalDate now = LocalDate.now(ZoneId.of("Asia/Seoul"));
        String month_str = now.getMonth().toString();
        year = now.getYear();
        month = now.getMonthValue();
        day = now.getDayOfMonth();
        Date newYearDay = new Date(year, 1, 1);
        Date today = new Date(year, month, day);
        Date christmas = new Date(year, 12, 25);
        System.out.print("AD Jan. 1, 1 is ");
        AD010101.printDate(); System.out.print("\n");
        System.out.print("Today is ");
        today.printDate(); System.out.print("\n");
        System.out.print("New year's day of this year was ");
        newYearDay.printDate(); System.out.print("\n");
        System.out.print("Christmas of this year is ");
        christmas.printDate(); System.out.print("\n");
        if (today.getMonth() == christmas.getMonth() && today.getDay() == christmas.getDay())
        {
            System.out.print("Today is Christmas! Happy Christmas to you all !!\n");
        }
        else
        {
            System.out.print("Sorry, today is not Christmas!\n");
            daysToChristmas = christmas.getElapsedDaysFromAD010101() - today.getElapsedDaysFromAD010101();
            System.out.printf(" You must wait %d day(s) to Christmas !\n", daysToChristmas);
        }
    }
}
