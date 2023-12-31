/**
 * Project Name : JavaProgramming and Application HW01.2
 * Program's purpose and basic function :
 * - Dynamic Fibonacci Calculator
 * Program First Author : JH KIM
 * Date of First Write : 2023.08.30
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.08.30			v1.00			First Write
 * JH KIM               2023.09.05          v1.01           add comment
 */
import java.util.Scanner;
public class Dyn_Fibonacci {
    final static int max_n = 1000;
    static double[] fb_n_tbl =new double[max_n];
    static boolean fb_n_tbl_initialized = false;
    public static double Dyn_Fibonacci(int n)   // Dynamic fibonacci
    {
        if (!fb_n_tbl_initialized) {
            for (int i=0; i<max_n; i++)
                fb_n_tbl[i] = 0;
            fb_n_tbl_initialized = true;
        }
        //if (!fb_n_tbl_initialized) {
        //    Arrays.fill(fb_n_tbl,0);
        //    fb_n_tbl_initialized = true;
        //}
        if (fb_n_tbl[n] != 0) {
            return fb_n_tbl[n];
        }
        else if ((n == 1) || (n == 0))
        {
            fb_n_tbl[n] = n;
            return n;
        }
        else    // fibo_n didn't calculate case
        {
            double fibo_n = Dyn_Fibonacci(n-2) + Dyn_Fibonacci(n-1);
            fb_n_tbl[n] = fibo_n;
            return fibo_n;
        }
    }
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n;
        double fibo_n;
        while (true)
        {
            System.out.print("input n (>=0) to find 0 ~ nth fibo_n(-1 to terminate) : ");
            n = cin.nextInt();  // input fibo_n
            if(n == -1)
                break;
            for (int i=0; i<=n;i++)
            {
                fibo_n=Dyn_Fibonacci(i);
                System.out.printf("%3d-th Fibonacci Series = %25.0f\n",i,fibo_n);
            }
        }
        cin.close();
    }
}
