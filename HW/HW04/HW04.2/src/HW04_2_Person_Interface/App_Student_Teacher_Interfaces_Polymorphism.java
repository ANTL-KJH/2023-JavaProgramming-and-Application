package HW04_2_Person_Interface;

public class App_Student_Teacher_Interfaces_Polymorphism {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Kim", 20, 11111, 97.5), new Student("Lee", 22, 12333, 92.8),
                new Teacher("Choi", 42, "YNU", "ICE", "Java"), new Teacher("Yoon", 53, "YNU", "ICE", "Python"),
                new Student("Park", 21, 22311, 88.8), new Teacher("Hong", 42, "YNU", "ME", "Electronics")
        };System.out.print("persons = [\n");
        for (int i=0; i< persons.length; i++) {
            System.out.print(persons[i]);
            if (i < persons.length - 1)
                System.out.print(", ");
            if (((i+1) % 3) == 0)
                System.out.println();
        }
        System.out.print(" ]");
        System.out.println("\nChecking the interfaces :");
        Person p0 = persons[0]; p0.talk();
        Student s0 = (Student) persons[0]; s0.study();
        Student s1 = (Student) persons[1]; s1.study();
        Person p2 = persons[2]; p2.listen();
        Teacher t2 = (Teacher) persons[2]; t2.move();
        Person p3 = persons[3]; p3.move();
        Student s4 = (Student) persons[4]; s4.move();
        Teacher t5 = (Teacher) persons[5]; t5.talk();
    }
}
