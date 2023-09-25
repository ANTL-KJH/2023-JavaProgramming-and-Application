package HW04_2_Person_Interface;

public class App_Student_Teacher_Interfaces_Polymorphism {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Kim", 201203, "YNU", "ICE", 11111, 97.5),
                new Student("Lee", 220315, "YNU", "ICE", 12333, 92.8),
                new Student("Park", 210125, "YNU", "ME", 22311, 88.8),
                new Teacher("Choi", 110305, "YNU", "ICE", "Java"),
                new Teacher("Yoon", 100720, "YNU", "ICE", "Python"),
                new Teacher("Hong", 110630, "YNU", "ME", "Electronics")
        };
        System.out.print("persons = [\n");
        for (int i=0; i< persons.length; i++) {
            System.out.print(persons[i]);
            if (i < persons.length - 1)
                System.out.print(", ");
            if (((i+1) % 2) == 0)
                System.out.printf("\n "); }
        System.out.print("]");
        System.out.println("\nChecking the interfaces :");
        Person p0 = persons[0]; p0.talk();
        Student s0 = (Student) persons[0]; s0.study();
        Student s1 = (Student) persons[1]; s1.study();
        Person p2 = persons[2]; p2.listen();
        Student t2 = (Student) persons[2]; t2.move();
        Person p3 = persons[3]; p3.move();
        Teacher s4 = (Teacher) persons[4]; s4.move();
        Teacher t5 = (Teacher) persons[5]; t5.talk();
    }
}
