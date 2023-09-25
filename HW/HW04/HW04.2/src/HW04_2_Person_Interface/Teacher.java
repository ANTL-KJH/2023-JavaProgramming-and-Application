/**
 * Project Name : JavaProgramming and Application HW04.2
 * Program's purpose and basic function :
 * - class Teacher
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.18
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.18			v1.00			First Write
 */
package HW04_2_Person_Interface;

public class Teacher extends Person implements TeacherActivity {
    String school;
    String major;
    String lecture;

    public Teacher(String nm, int reg_id, String school, String major, String lecture) {
        super(nm, reg_id);
        this.school = school;
        this.major = major;
        this.lecture = lecture;
    }

    public String toString() {

        return "Teacher(%s, %d, %s, %s)".formatted(this.getName(), this.getReg_id(), this.school, this.getMajor());
    }
    // accessor
    public String getMajor() {
        return this.major;
    }

    // Overriding
    @Override
    public void listen() {
        System.out.printf("teacher (%s, %s) :: listening ... \n", this.getName(), this.getMajor());
    }

    @Override
    public void talk() {
        System.out.printf("teacher (%s, %s) :: talking ... \n", this.getName(), this.getMajor());
    }

    @Override
    public void move() {
        System.out.printf("teacher (%s, %s) :: moving ... \n", this.getName(), this.getMajor());
    }

    @Override
    public void teach() {
        System.out.printf("teacher (%s, %s) :: teaching ... \n", this.getName(), this.getMajor());
    }
}
