package ch08_HashCode;

public class Test_HashCode {
    public static void main(String[] args) {
        Person[] persons = {
                new Person(1111, "AAA"), new Person(2222, "BBB"), new Person(3333, "CCC"), new Person(4444, "DDD"),
                new Person(1111, "AAA")};
        int hashCode;
        for (int i=0; i<persons.length; i++) {
            hashCode = persons[i].hashCode();
            System.out.printf("persons[%d] : %s : hashCode = %10d\n", i, persons[i], hashCode);
        }
        if (persons[0] == persons[4]) {
            System.out.printf("persons[0] == persons[4] => true\n");
        } else {
            System.out.printf("persons[0] == persons[4] => false\n");
        }
        if (persons[0].equals(persons[4])) {
            System.out.printf("persons[0].equals(persons[4]) => true\n");
        } else {
            System.out.printf("persons[0].equals(persons[4]) => false\n");
        }
    }
}