package ch02_2_5_Data_Time_Formatting;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

public class Date_Time_Formatting {
    public static void main(String[] args)
    {
        Locale englishUS = Locale.US;
        LocalDateTime ldt = LocalDateTime.now();
        System.out.printf(englishUS, "Current date-time : %tB %<te, %<tY %<tT %<Tp%n", ldt);
    }
}
