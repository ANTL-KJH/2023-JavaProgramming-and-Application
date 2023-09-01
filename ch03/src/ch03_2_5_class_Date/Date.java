package ch03_2_5_class_Date;

import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;
    enum WEEKDAY { SUN, MON, TUE, WED, THR, FRI, SAT };
    enum MONTH { Dummy, JAN, FED, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC };
    static final String[] weekDayName = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    static final String[] weekDayNameShort = { "SUN", "MON", "TUE", "WED", "THR", "FRI", "SAT" };
    static final String[] monthName = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };
    public Date() { //default constructor
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }
    public Date(int y, int m, int d) {
        this.setDate(y, m, d);
    }
    public int getMonth() {
        return this.month;
    }
    public int getDay() {
        return this.day;
    }
    private boolean isValidDate(int y, int m, int d) {
        int[] days_month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (this.isLeapYear(y))
            days_month[2] = 29;
        if (((m >= 1) && (m <= 12)) && ((d >= 1) && (d <= days_month[m]))) {
            return true;
        } else {
            System.out.printf("Ilegal date! (month= %d, day = %d)\n", m, d);
            return false;
        }
    }
    private void setDate(int y, int m, int d)
    {
        if (isValidDate(y, m, d))
        {
            this.year = y;
            this.month = m;
            this.day = d;
        } else{System.out.printf("Ilegal date! (%d, %d, %d) ==> Program aborted.\n", y, m, d);
        }
    }
    private void setMonth(int newMonth)
    {
        if ((newMonth >= 1) && (newMonth <= 12))
            this.month = newMonth;
        else {
            System.out.printf("Illegal month value (%d)! Program aborted.\n", newMonth);
        }this.day = 1;
    }
    private void setYear(int y) {
        this.year = y;
    }
    public int getYearDay(int year, int month, int day) {
        int[] days_month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int yearDay = 0;
        for (int m = 1; m < month; m++)
            yearDay += days_month[m];
        yearDay += day;
        if ((month > 2) && isLeapYear(year))
            yearDay += 1;
        return yearDay;
    }
    public int getElapsedDaysFromAD010101() {
        int elpsDay = 0;
        elpsDay = getElapsedDaysFromAD010101(this);
        return elpsDay;
    }
    private int getElapsedDaysFromAD010101(Date d) {
        int yearDay;
        int elpsDay = 0;
        for (int y = 1; y < d.year; y++) {
            if (isLeapYear(y))
                elpsDay += 366;
            else
                elpsDay += 365;
        }
        yearDay = getYearDay(d.year, d.month, d.day);
        elpsDay += yearDay;
        return elpsDay;
    }
    public int getWeekDay(Date d) {
        int weekDay_AD010101 = 1; // 1. 1. 1. is Monday
        int yearDay;
        int weekDay;
        int elapsedDays = 0;
        elapsedDays = getElapsedDaysFromAD010101(d);
        weekDay = (elapsedDays + weekDay_AD010101 - 1) % 7;
        return weekDay;
    }
    public void printDate() {
        int yearDay = 0;
        int weekDay;
        if ((month >= 1) && (month <= 12))
            System.out.printf("%s", monthName[month]);
        System.out.printf(" %d, %d", day, year);
        yearDay = getYearDay(this.year, this.month, this.day);
        if ((yearDay < 1) || (yearDay > 366)) {
            System.out.printf("Error in calculation of yearDay : %d\n", yearDay);
        } else {
            weekDay = getWeekDay(this);
            System.out.printf(" ( %s )", weekDayName[weekDay]);
        }
    }
    public void inputDate()
    {
        int y, m, d;
        Scanner cin = new Scanner(System.in);
        System.out.printf("Enter date in year month day : ");
        y = cin.nextInt();
        m = cin.nextInt();
        d = cin.nextInt();
        if (isValidDate(y, m, d)) {
            year = y;
            month = m;
            day = d;
        } else {
            System.out.printf("Ilegal date! Program aborted.\n");
        }
    }
    public boolean isLeapYear(int y) {
        if ((((y % 4) == 0) && ((y % 100) != 0)) || ((y % 400) == 0))
            return true;
        else
            return false;
    }
    private boolean isLeapYear() {
        return isLeapYear(this.year);
    }

}
