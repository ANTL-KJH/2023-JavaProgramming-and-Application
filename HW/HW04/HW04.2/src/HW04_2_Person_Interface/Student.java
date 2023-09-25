/**
 * Project Name : JavaProgramming and Application HW04.2
 * Program's purpose and basic function :
 * - class Student
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.18
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.18			v1.00			First Write
 */
package HW04_2_Person_Interface;

public class Student extends Person implements StudentActivity {
    private int st_id; // data member, student_id
    private double gpa; // data member, grade point average
    private String school;
    private String major;
    public Student(String nm, int reg_id, String school, String major, int st_id, double st_gpa) {
        super(nm, reg_id);
        this.school = school;
        this.major = major;
        this.st_id = st_id;
        this.gpa = st_gpa;
    }
    // accessor
    public int getStID() {
        return this.st_id;
    }

    public double getGPA() {
        return this.gpa;
    }
    public String getSchool() { return this.school; }
    public String toString() {
        String str = "Student(%s, %d, %d, %s)".formatted(this.getName(), this.getReg_id(), this.getStID(), this.getSchool());
        return str;
    }
    // Overriding
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
