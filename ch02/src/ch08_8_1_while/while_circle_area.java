package ch08_8_1_while;

import java.util.Scanner;

public class while_circle_area {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        final double PI = 3.141592;
        double radius, area, circumference;
        while (true) {
            System.out.print("input radius of a circle (0 to quit) : ");
            radius = cin.nextDouble();
            if (radius == 0)
                break;
            area = PI * radius * radius;
            circumference = 2.0 * PI * radius;
            System.out.println("radius = " + radius + ": area = " + area + ", circumference = " + circumference);
        }
    }
}
