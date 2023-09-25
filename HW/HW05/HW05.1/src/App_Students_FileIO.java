import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App_Students_FileIO {
    public static void main(String[] args) throws IOException {
        final String fin_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\HW\\HW05\\HW05.1\\students.txt";
        final String fout_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\HW\\HW05\\HW05.1\\processed_students.txt";
        StudentArray students = new StudentArray();
        Scanner fin = new Scanner(new File(fin_name));
        FileWriter fout = new FileWriter(fout_name);
        students.fget_students(fin);
        System.out.print("Before sorting : ");
        students.print_students();
        fout.write("Initial state of students :");
        students.fprint_students(fout);
        students.sort("name", "increasing");
        System.out.print("\nAfter sorting by name : ");
        students.print_students();
        fout.write("\nAfter sorting by name : ");
        students.fprint_students(fout);
        students.sort("st_id", "increasing");
        System.out.print("\nAfter sorting by st_id : ");
        students.print_students();
        fout.write("\nAfter sorting by st_id : ");
        students.fprint_students(fout);
        students.sort("GPA", "decreasing");
        System.out.print("\nAfter sorting by GPA : ");
        students.print_students();
        fout.write("\nAfter sorting by GPA : ");
        students.fprint_students(fout);
        fout.close();
    }
}
