package ch06_2_5_HashMap_String;
import java.util.*;

public class HashMap_String_Int {
    public static void main(String[] args) {
        HashMap<Integer, String> hm_month_name = new HashMap<Integer, String>();
        String[] month_names =
                {"", "January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December"};
        for (int i = 1; i <= 12; i++) {
            hm_month_name.put(i, month_names[i]);
        }
        Set<Integer> keys = hm_month_name.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            int key = it.next();
            String value = hm_month_name.get(key);
            System.out.println("(" + key + ", " + value + ")");
        }
    }
}
