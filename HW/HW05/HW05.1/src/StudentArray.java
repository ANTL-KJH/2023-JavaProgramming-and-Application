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

        for (int i = 0; i < this.num_students - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < this.num_students; j++) {
                if (Objects.equals(sorting_order, "increasing"))
                {
                    if (this.students[minIdx].compareStudent(key_attr, this.students[j]) > 0)
                        minIdx = j;
                }

                else if(Objects.equals(sorting_order, "decreasing"))
                {
                    if (this.students[minIdx].compareStudent(key_attr, this.students[j]) < 0)
                        minIdx = j;
                }

            }
            if (minIdx != i) {
                Student temp = students[i];
                this.students[i] = this.students[minIdx];
                this.students[minIdx] = temp;
            }
        }


    }

}
