package ch03_5_3_Function_Execution_Time_Measurements_in_Milliseconds;

import java.util.Scanner;

public class Fibonacci_Time_Measurements {
    public static double SR_Fibonacci(int n) {
        double fb_n;
        if ((n == 0) || (n == 1))
            fb_n = n;
        else {
            fb_n = SR_Fibonacci(n-2) + SR_Fibonacci(n-1);
        }
        return fb_n;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        double fibo_n;
        while (true) {
            System.out.print("input n (>= 0) to find 0 ~ nth fibo_n (-1 to terminate) : ");
            n = cin.nextInt();
            if (n == -1)
                break;
            for (int i=0; i<=n; i++) {
                long t1, t2;
                t1 = System.currentTimeMillis();
                fibo_n = SR_Fibonacci(i);
                t2 = System.currentTimeMillis();
                long elapsed_time_ms = t2 - t1;
                System.out.printf("%3d-th Fibonacci Series = %25.0f", i, fibo_n);
                System.out.printf(", took %10d milliseconds\n", elapsed_time_ms);
            }
        }
        cin.close();
    }
}
