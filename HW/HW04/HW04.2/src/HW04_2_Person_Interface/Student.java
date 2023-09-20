package HW04_2_Person_Interface;

public class Student extends Person implements StudentActivity {
    private int st_id; // data member, student_id
    private double gpa; // data member, grade point average

    public Student(String nm, int reg_id, int sid, double s_gpa) {
        super(nm, reg_id);
        this.st_id = sid;
        this.gpa = s_gpa;
    }

    public int getStID() {
        return this.st_id;
    }

    public double getGPA() {
        return this.gpa;
    }

    public String toString() {
        String str = "Student(%s, %d, %d)".formatted(this.getName(), this.getAge(), this.getStID());
        return str;
    }

    @Override
    public void listen() {
        System.out.printf("student (%s, %d) :: listening ... \n", this.getName(), this.getStID());
    }

    @Override
    public void talk() {
        System.out.printf("student (%s, %d) :: talking ... \n", this.getName(), this.getStID());
    }

    @Override
    public void move() {
        System.out.printf("student (%s, %d) :: moving ... \n", this.getName(), this.getStID());
    }

    @Override
    public void study() {
        System.out.printf("student (%s, %d) :: studying ... \n", this.getName(), this.getStID());
    }
}
