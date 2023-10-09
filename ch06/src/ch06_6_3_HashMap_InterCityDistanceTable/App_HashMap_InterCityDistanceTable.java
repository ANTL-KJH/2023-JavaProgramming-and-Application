package ch06_6_3_HashMap_InterCityDistanceTable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class App_HashMap_InterCityDistanceTable {
    public static HashMap<CityPair, Integer> fget_InterCityDistMap(String fname) throws FileNotFoundException {
        HashMap<CityPair, Integer> hmap_ICD = new HashMap<CityPair, Integer>();
        Scanner fin = new Scanner(new File(fname));
        String city_1, city_2;
        int dist;
        while(fin.hasNext()) {
            city_1 = fin.next();
            city_2 = fin.next();
            dist = fin.nextInt();
            hmap_ICD.put(new CityPair(city_1, city_2), dist);
            hmap_ICD.put(new CityPair(city_2, city_1), dist);
        }
        return hmap_ICD;
    }
    public static void main(String[] args) throws IOException {
        final String fname_ICD = "C:\\Users\\KJH\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\ch06\\interCityDistance.txt";
        HashMap<CityPair, Integer> hmap_ICD;
        hmap_ICD = fget_InterCityDistMap(fname_ICD);
        int size = hmap_ICD.size();
        System.out.printf("hmap_ICD (size = %d) = %s\n", size, hmap_ICD);
        Set<CityPair> hmap_ICD_keys = hmap_ICD.keySet();
        System.out.printf("hmap_ICD_keys = %s\n", hmap_ICD_keys);
        CityPair[] test_cityPairs = {new CityPair("A", "D"), new CityPair("D", "A")};
        for (CityPair tst_cp : test_cityPairs) {
            if (hmap_ICD.containsKey(tst_cp)) {
                int dist = hmap_ICD.get(tst_cp);
                System.out.printf("Distance of %s = %d\n", tst_cp, dist);
            } else {
                System.out.printf("key %s is not included in hashMap !!\n", tst_cp);
            }
        }
    }
}
