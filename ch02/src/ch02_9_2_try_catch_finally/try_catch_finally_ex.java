package ch02_9_2_try_catch_finally;

import java.util.Scanner;

public class try_catch_finally_ex {
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int dividend, divisor;
        double division_result;
        while (true) {
            System.out.print("input dividend (integer) : ");
            dividend = cin.nextInt();
            System.out.print("input divisor (integer) : ");
            divisor = cin.nextInt();
            try{
                division_result = dividend / divisor;
                System.out.printf("division_result = dividend / divisor = %f\n", division_result);
                break;
            }
            catch(ArithmeticException e) {
                System.out.println("ArithmeticException : " + e);
                System.out.println("Please re-try with correct data !!");
            }
        } //end while
    }
}
