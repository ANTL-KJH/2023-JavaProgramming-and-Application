package ch06_6_2_HashMap_forEach;
import java.util.HashMap;
import java.util.Set;
import java.util.Collection;
public class App_HashMap_forEach {
    private static final String Collection = null;
    public static void main(String[] args) {
        HashMap<Integer, String> hmap_month_name = new HashMap<Integer, String>();
        String[] month_names =
                {"", "January", "February", "March", "April", "May", "June",
                        "July", "August", "September", "October", "November", "December" };
        for (int i=1; i<=12; i++) {
            hmap_month_name.put(i, month_names[i]);
        }
        Set<Integer> m_keys = hmap_month_name.keySet();
        System.out.println("m_keys = " + m_keys);
        Collection<String> m_values = hmap_month_name.values();
        System.out.println("m_values = " + m_values);
        hmap_month_name.forEach((intKey, strValue)->{
            System.out.printf("%2d-th month name = %s\n", intKey, strValue );
        });
    }
}
