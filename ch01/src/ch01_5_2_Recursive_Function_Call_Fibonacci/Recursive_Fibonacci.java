package ch01_5_2_Recursive_Function_Call_Fibonacci;

import java.util.Scanner;

public class Recursive_Fibonacci {
    public static double SR_Fibonacci(int n) {
        double fb_n;
        if ((n == 0) || (n == 1))
            fb_n = n;
        else
            fb_n = SR_Fibonacci(n - 2) + SR_Fibonacci(n - 1);
        return fb_n;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        double fibo_n;
        while (true) {
            System.out.print("input n(>=0) to find 0 ~ nth fibo_n (-1 to terminate) : ");
            n = cin.nextInt();
            if (n == -1)
                break;
            for (int i = 0; i <= n; i++) {
                fibo_n = SR_Fibonacci(i);
                System.out.printf("%3d-th Fibonacci Series = %25f\n", i, fibo_n);
            }
        }
    }
}
