package ch06_6_6_ConcurrentSkipListMap_Student;

public class Student {
    private String name; // data member
    private int regID; // data member
    private String school;
    private String major;
    private int stID; // data member, student_id
    private double GPA; // data member, grade point average
    public Student(String nm, int regID, String school, String major, int stID, double stGPA) {
        this.name = nm;
        this.regID = regID;
        this.school = school;
        this.major = major;
        this.stID = stID;
        this.GPA = stGPA;
    }
    public String getName() { return this.name; }
    public int getRegID() { return this.regID; }
    public int getStID() { return this.stID; }
    public double getGPA() { return this.GPA; }
    public String toString() {
        String str = String.format("Student(name=%s, regID=%d, school=%s, major=%s, stID=%d, GPA=%f)",
                this.name, this.regID, this.school, this.major, this.stID, this.GPA);
        return str;
    }
}
