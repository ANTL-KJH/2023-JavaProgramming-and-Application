package ch_02_2_Java_data_types;
import java.util.Scanner;
public class Java_basic_data_types {
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        System.out.println("Input two double data x and y :");
        double x, y;
        x = cin.nextDouble();
        y = cin.nextDouble();
        System.out.printf("x (%5.3f) + y (%5.3f) = %5.3f\n", x, y, x+y);
        System.out.printf("x (%5.3f) - y (%5.3f) = %5.3f\n", x, y, x-y);
        System.out.printf("x (%5.3f) * y (%5.3f) = %5.3f\n", x, y, x*y);
        System.out.printf("x (%5.3f) / y (%5.3f) = %5.3f\n", x, y, x/y);
    }
}
