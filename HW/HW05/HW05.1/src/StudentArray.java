/**
 * Project Name : JavaProgramming and Application HW05.1
 * Program's purpose and basic function :
 * - class StudentArray
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.22
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.22			v1.00			First Write
 * JH KIM               2023.09.25          v1.10           sorting algorithm changed(selection -> insertion)
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class StudentArray {
    public Student[] students;
    public int num_students;

    StudentArray() {
    }

    public void fget_students(Scanner fin) {
        this.num_students = fin.nextInt();
        this.students = new Student[this.num_students];
        for (int i = 0; i < this.num_students; i++) {
            String name = fin.next();
            int reg_id = fin.nextInt();
            int st_id = fin.nextInt();
            String dept = fin.next();
            String school = fin.next();
            double gpa = fin.nextDouble();
            this.students[i] = new Student(name, reg_id, st_id, dept, school, gpa);
        }
    }

    public void print_students() {
        System.out.println();
        for (int i = 0; i < this.num_students; i++) {
            System.out.println(this.students[i]);
        }
    }

    public void fprint_students(FileWriter fout) throws IOException {
        fout.write(" Total " + this.num_students + " students :");
        fout.write("\n");
        for (int i = 0; i < this.num_students; i++) {
            fout.write(String.valueOf(this.students[i]) + "\n");
        }
    }

    public void sort(String key_attr, String sorting_order) {
        // insertion sorting
        for(int i=1;i<=this.num_students-1;i++)
        {
            Student temp = this.students[i];
            int j=i;
            if (Objects.equals(sorting_order, "increasing"))
            {
                for(; j>0&&students[j-1].compareStudent(key_attr, temp)>=0; j--)
                {
                    this.students[j]=this.students[j-1];
                }
            }
            else {
                for(; j>0&&students[j-1].compareStudent(key_attr, temp)<=0; j--)
                {
                    this.students[j]=this.students[j-1];
                }
            }
            this.students[j]= temp;
        }

    }

}
