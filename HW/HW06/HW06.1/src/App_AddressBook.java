/**
 * Project Name : JavaProgramming and Application HW06.1
 * Program's purpose and basic function :
 * - Application Person Address Book
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.09
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.09			v1.00			First Write
 */
import java.util.TreeMap;
import java.util.Set;
public class App_AddressBook {
    public static void main(String[] args) {
        TreeMap<String, Person> addrBook = new TreeMap<String, Person>(); // gen Treemap instance
        // Person array
        Person[] persons = {
                new Person("Kim", new TelNum(82, 53, 810, 1000)),
                new Person("Yoon", new TelNum(82, 2, 1234, 5678)),
                new Person("Lee", new TelNum(82, 51, 2579, 1234)),
                new Person("Park", new TelNum(82, 53, 1000, 5678)),
                new Person("Choi", new TelNum(82, 31, 2345, 6789)),
        };
        // Add Person instance at addrBook
        for (Person p : persons) {
            addrBook.put(p.getName(), p);
        }
        // printout
        for (Person p : persons) {
            String nm = p.getName();
            System.out.printf("%5s : %s\n", nm, addrBook.get(nm));
        }

        Set<String> keySet_name = addrBook.keySet(); // gen KeySet instance
        // printout
        System.out.printf("keySet_name = %s\n", keySet_name);
        for(String key : keySet_name) {
            System.out.printf("%5s : %s\n", key, addrBook.get(key));
        }
    }
}
