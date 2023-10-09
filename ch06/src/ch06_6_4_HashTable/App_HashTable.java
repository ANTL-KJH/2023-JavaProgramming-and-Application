package ch06_6_4_HashTable;
import java.util.Enumeration;
import java.util.Hashtable;
public class App_HashTable {
    public static void main(String[] args) {
        NumPrfx[] numPrefixes = {
                new NumPrfx(1, "uni"), new NumPrfx(2, "bi"), new NumPrfx(3, "tri"), new NumPrfx(4, "quad"), new NumPrfx(5, "penta"),
                new NumPrfx(6, "hexa"), new NumPrfx(7, "sept"), new NumPrfx(8, "oct"), new NumPrfx(9, "nona"), new NumPrfx(10, "deca"),
                new NumPrfx(11, "hendeca"), new NumPrfx(12, "dodeca"), new NumPrfx(100, "hecto"), new NumPrfx(1000, "kilo"),
                new NumPrfx(1E6D, "mega"), new NumPrfx(1E9D, "giga"), new NumPrfx(1E12D, "tera")
        };Hashtable<Double, String> hashTbl_NumPrefix = new Hashtable<Double, String>();
        for (NumPrfx numPrfx : numPrefixes) {
            hashTbl_NumPrefix.put(numPrfx.getValue(), numPrfx.getPrefix());
        }
        Enumeration<Double> keys = hashTbl_NumPrefix.keys();
        double key;
        while(keys.hasMoreElements()) {
            key = (double) keys.nextElement();
            System.out.printf("Prefix for %.0f = %s\n",
                    key, hashTbl_NumPrefix.get(key));
        }
    }
}
