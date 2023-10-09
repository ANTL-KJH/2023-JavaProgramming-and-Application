package ch06_6_4_TreeMap;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
public class App_TreeMap_NumPrefix {
    public static void main(String[] args) {
        NumPrfx[] numPrefixes = {
                new NumPrfx(1E6D, "mega"), new NumPrfx(1E9D, "giga"), new NumPrfx(1E12D, "tera"),
                new NumPrfx(1, "uni"), new NumPrfx(2, "bi"), new NumPrfx(3, "tri"), new NumPrfx(4, "quad"), new NumPrfx(5, "penta"),
                new NumPrfx(6, "hexa"), new NumPrfx(7, "sept"), new NumPrfx(8, "oct"), new NumPrfx(9, "nona"), new NumPrfx(10, "deca"),
                new NumPrfx(11, "hendeca"), new NumPrfx(12, "dodeca"), new NumPrfx(100, "hecto"), new NumPrfx(1000, "kilo")
        };
        TreeMap<Double, String> treeMap_NumPrefix = new TreeMap<Double, String>();
        for (NumPrfx numPrfx : numPrefixes) {
            treeMap_NumPrefix.put(numPrfx.getValue(), numPrfx.getPrefix());
        }
        Set<Double> keys = treeMap_NumPrefix.keySet();
        double key;
        Iterator<Double> itr_Dbl = keys.iterator();
        while(itr_Dbl.hasNext()) {
            key = (double) itr_Dbl.next();
            System.out.printf("Prefix for %.0f = %s\n",
                    key, treeMap_NumPrefix.get(key));
        }
    }
}
