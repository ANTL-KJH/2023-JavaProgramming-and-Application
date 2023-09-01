package ch03_2_1_Class_Person_Ex;

public class App_Person {
    public static void main(String[] args) {
        System.out.println("Testing instances of class Person with static data member");
        Person[] persons = {
                new Person("Hong", 11111),
                new Person("Kim", 22222),
                new Person("Lee", 33333),
                new Person("Yoon", 44444),
                new Person("Choi", 55555)
        }; // array of instances of class Person
        int n_persons = persons[0].num_person;
        for (int i=0; i<n_persons; i++) {
            persons[i].print_person();
        }
    }
}
