package ch03_3_3_DateArray_sort;

import java.util.Arrays;

public class DateArray {
    public static void compareDates(Date d1, Date d2) {
        if (d1.compareTo(d2) < 0) {
            System.out.printf("date "); d1.print();
            System.out.printf(" is less than date "); d2.print();
            System.out.printf("\n");
        } else if (d1.compareTo(d2) > 0) {
            System.out.printf("date "); d1.print();
            System.out.printf(" is greater than date "); d2.print();
            System.out.printf("\n");
        } else {
            System.out.printf("date "); d1.print();
            System.out.printf(" and date "); d2.print();
            System.out.printf(") are same !!\n");
        }
    }
    public static void main(String[] args) {
        Date[] dates = {new Date(1, 1, 1), new Date(2023, 9, 1), new Date(2, 1, 1),
                new Date(2022, 8, 31), new Date(1, 12, 31)};
        int num_dates = 5;
        System.out.printf("Before Arrays.sort(dates) : ");
        for (int i=0; i<num_dates; i++) {
            dates[i].print(); System.out.printf(", ");
        }
        System.out.printf("\n");
        compareDates(dates[0], dates[1]);
        compareDates(dates[1], dates[3]);
        compareDates(dates[1], dates[1]);
        Arrays.sort(dates); // class Date must implement Comparable<Date>
        System.out.printf("After Arrays.sort(dates) : ");
        for (int i=0; i<num_dates; i++) {
            dates[i].print(); System.out.printf(", ");
        }
        System.out.printf("\n");
    }
}
