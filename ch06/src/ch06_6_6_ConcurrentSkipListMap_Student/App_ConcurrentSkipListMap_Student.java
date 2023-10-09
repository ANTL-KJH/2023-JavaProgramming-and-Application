package ch06_6_6_ConcurrentSkipListMap_Student;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
public class App_ConcurrentSkipListMap_Student {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Kim", 200103, "YU", "ICE", 11111, 4.47),
                new Student("Lee", 211015, "KRU", "CE", 12234, 4.32),
                new Student("Park", 200725, "DGU", "ME", 13375, 3.95),
                new Student("Yoon", 190513, "GMU", "ME", 10339, 4.15),
                new Student("Choi", 221107, "KHU", "EE", 12375, 4.43)
        };
        int regID, stID;
        String stName;
        ConcurrentSkipListMap<Integer, Student> concSkipListMap_Students_byRegID = new ConcurrentSkipListMap<Integer, Student>();
        ConcurrentSkipListMap<Integer, Student> concSkipListMap_Students_byStID= new ConcurrentSkipListMap<Integer, Student>();
        ConcurrentSkipListMap<String, Student> concSkipListMap_Students_byName= new ConcurrentSkipListMap<String, Student>();
        for (Student st : students) {
            System.out.printf("put(Student %s)\n", st);
            regID = st.getRegID();
            stID = st.getStID();
            stName = st.getName();
            concSkipListMap_Students_byRegID.put(regID, st);
            concSkipListMap_Students_byStID.put(stID, st);
            concSkipListMap_Students_byName.put(stName, st);
        }
        System.out.printf("\nConcurrentSkipListMap_Student_byRegID =\n");
        Set<Integer> keys_regID = concSkipListMap_Students_byRegID.keySet();
        int key_regID;
        Iterator<Integer> itr_regID = keys_regID.iterator();
        while(itr_regID.hasNext()) {
            key_regID = (int) itr_regID.next();
            System.out.printf("concSkipListMap_Students_byRegID for regID (%d) = %s\n",
                    key_regID, concSkipListMap_Students_byRegID.get(key_regID));
        }
        System.out.printf("\nConcurrentSkipListMap_Student_byStID =\n");
        Set<Integer> keys_stID = concSkipListMap_Students_byStID.keySet();
        int key_stID;
        Iterator<Integer> itr_stID = keys_stID.iterator();
        while(itr_stID.hasNext()) {
            key_stID = (int) itr_stID.next();
            System.out.printf("concSkipListMap_Students_byStID for stID (%d) = %s\n",
                    key_stID, concSkipListMap_Students_byStID.get(key_stID));
        }
        System.out.printf("\nConcurrentSkipListMap_Student_byName =\n");
        Set<String> keys_Name = concSkipListMap_Students_byName.keySet();
        String key_Name;
        Iterator<String> itr_Name = keys_Name.iterator();
        while(itr_Name.hasNext()) {
            key_Name = itr_Name.next();
            System.out.printf("concSkipListMap_Students_byName for stName (%s) = %s\n",
                    key_Name, concSkipListMap_Students_byName.get(key_Name));
        }
    }
}
