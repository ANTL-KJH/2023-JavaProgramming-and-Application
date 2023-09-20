package ch04_2_1_Inheritance_Person_Student_Employee;

public class Student extends Person{
    private int st_id;
    private String dept;
    private String school;
    private double GPA;
    public Student() { } // default constructor
    public Student(String nm, int reg_ID, int st_id, String dept, String school, double gpa ) {
        super(nm, reg_ID); // invoke constructor of parent class Person
        this.st_id = st_id;
        this.dept = dept;
        this.school = school;
        this.GPA = gpa;
    }
    public void print() {
        System.out.printf("Student(");
        super.print();
        System.out.printf("), school: %s, dept: %s, st_ID:%d, GPA:%8.2f)\n", this.school, this.dept, this.st_id, this.GPA);
    }
}
