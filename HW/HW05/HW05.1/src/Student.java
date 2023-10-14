/**
 * Project Name : JavaProgramming and Application HW05.1
 * Program's purpose and basic function :
 * - class Student
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.22
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.22			v1.00			First Write
 */

import java.util.Objects;

public class Student extends Person {
    int st_id;
    String dept;
    String school;
    double GPA;
    // constructor
    Student(String nm, int reg_id, int st_id, String dept, String school, double gpa) {
        super(nm, reg_id);
        this.st_id = st_id;
        this.dept = dept;
        this.school = school;
        this.GPA = gpa;
    }

    public String toString() {
        return "Student(name:%8s, reg_id:%8d, school:%8s, dept:%8s, st_id:%8d, GPA: %8.2f)".formatted(this.getName(), this.getReg_id(), this.school, this.dept, this.st_id, this.GPA);
    }

    // compare student
    int compareStudent(String key_attr, Student other) {
        if (Objects.equals(key_attr, "name")) {
            return this.getName().compareTo(other.getName());
        } else if (Objects.equals(key_attr, "reg_id")) {
            return Integer.compare(this.getReg_id(), other.getReg_id());
        } else if (Objects.equals(key_attr, "st_id")) {
            return Integer.compare(this.st_id, other.st_id);
        } else if (Objects.equals(key_attr, "GPA")) {
            return Double.compare(this.GPA, other.GPA);
        }
        return 0;
    }


}
