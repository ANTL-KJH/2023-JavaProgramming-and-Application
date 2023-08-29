package ch01_2_2_Circle_Area_circumf;
import java.util.Scanner;

public class Circle_Area_Circumf_Double {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        final double PI = 3.141592;
        double radius, area, circumference;
        while (true) {
            System.out.print("input radius of a circle in double type (0 to quit) : ");
            radius = cin.nextDouble();
            if (radius == 0)
                break;
            area = PI * radius * radius;
            circumference = 2.0 * PI * radius;
            System.out.printf("radius = %f => area = %f, circumference = %f\n", radius, area, circumference);
        }
        cin.close();
    }
}
