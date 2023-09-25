import java.util.Objects;

public class Student extends Person implements Comparable<Student>{
    int st_id;
    String dept;
    String school;
    double GPA;
    Student(String nm, int reg_id, int st_id, String dept, String school, double gpa)
    {
        super(nm, reg_id);
        this.st_id = st_id;
        this.dept = dept;
        this.school = school;
        this.GPA =gpa;
    }
    public String toString(){return "Student(name:%8s, reg_id:%8d, school:%8s, dept:%8s, st_id:%8d, GPA: %8.2f)".formatted(this.name, this.reg_id, this.school,this.dept,this.st_id,this.GPA);}
    public int compareTo(Student other)
    {
        return 1;
    }
    public int compareTo(Student other, String key)
    {
        if(Objects.equals(key, "name"))
        {
            return this.name.compareTo(other.name);
        }
        else if(Objects.equals(key, "reg_id"))
        {
            return Integer.compare(this.reg_id, other.reg_id);
        }
        else if(Objects.equals(key, "st_id"))
        {
            return Integer.compare(this.st_id, other.st_id);
        }
        else if(Objects.equals(key, "GPA"))
        {
            return Double.compare(this.GPA, other.GPA);
        }
        return 0;
    }
    int compareStudent(String key_attr, Student other)
    {
        return this.compareTo(other, key_attr);
    }


}
