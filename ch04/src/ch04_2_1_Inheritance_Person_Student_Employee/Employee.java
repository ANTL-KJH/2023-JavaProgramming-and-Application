package ch04_2_1_Inheritance_Person_Student_Employee;

public class Employee extends Person{
    private int emp_id;
    private String company;
    private String department;
    public Employee(String name, int reg_ID, int emp_id, String company, String department) {
        super(name, reg_ID);
        this.emp_id = emp_id;
        this.company = company;
        this.department = department;
    }
    public void print()
    {
        System.out.printf("Employee(");
        super.print();
        System.out.printf("), company:%s, dept:%s, emp_ID:%d)\n", this.company, this.department, this.emp_id);
    }
}
