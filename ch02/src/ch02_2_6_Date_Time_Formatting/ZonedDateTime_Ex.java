package ch02_2_6_Date_Time_Formatting;
import java.time.ZonedDateTime;
import java.util.Locale;
public class ZonedDateTime_Ex {
    public static void main(String[] args)
    {
        Locale englishUS = Locale.US;
        ZonedDateTime currentTime = ZonedDateTime.now ();
        System.out .printf(englishUS, "%tA %<tB %<te, %<tY %n", currentTime);
        System.out .printf(englishUS, "%TA %<TB %<te, %<tY %n", currentTime);
        System.out .printf(englishUS, "%tD %n", currentTime);
        System.out .printf(englishUS, "%tF %n", currentTime);
        System.out .printf(englishUS, "%tc %n", currentTime);
        System.out .printf(englishUS, "%Tc %n", currentTime);
    }
}
