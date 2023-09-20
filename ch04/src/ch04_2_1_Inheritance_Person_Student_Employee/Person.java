package ch04_2_1_Inheritance_Person_Student_Employee;

public class Person {
    private String name;
    private int reg_ID;
    static int num_person;
    public Person() { } // default constructor
    public Person(String nm, int reg_ID) {
        this.name = nm;
        this.reg_ID = reg_ID;
        num_person += 1;
    }
    public void print() {
        System.out.printf("Person(name: %s, reg_id: %d)", this.name, this.reg_ID);
    }
    protected String getName() {
        return this.name;
    }
    protected int getRegID() {
        return this.reg_ID;
    }
}
