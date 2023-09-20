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
        String str = "Teacher(%s, %d, %s, %s)".formatted(this.getName(), this.getAge(), this.school, this.getMajor());
        return str;
    }

    public String getMajor() {
        return this.major;
    }

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
