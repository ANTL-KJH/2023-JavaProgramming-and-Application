package ch01_1_JavaProg_Ex1;
import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;
public class JavaProg_Ex1 {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        System.out.println("Hello World !!");
        System.out.println("This is my first Java Program.");
        Scanner scin = new Scanner(System.in);
        System.out.print("Input your name : ");
        String name = scin.next();
        System.out.println("Hi " + name + "! I am glad to meet you.");
        try {
            System.out.print("Please input two integers, separated with space : ");
            int x = scin.nextInt();
            int y = scin.nextInt();
            int sum = sum(x, y);
            System.out.println(x + " + " + y + " = " + sum);
        }
        catch(InputMismatchException e)
        {
            System.out.print("Input data is not integer !!");
        }
        scin.close();
    }
}
