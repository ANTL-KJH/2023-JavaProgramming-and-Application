/**
 * Project Name : JavaProgramming and Application HW07.1
 * Program's purpose and basic function :
 * - Knapsack Problem based on DP
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.15
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.15			v1.00			First Write
 */
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App_KnapsackProblem01 {
    public static void main(String[] args) throws IOException {

        KSP_Solution sol;
        int knapsack_capacity = 20;
        final String f_items = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\HW\\HW07\\HW07.1\\KSP_items.txt";
        Scanner fin = new Scanner(new File(f_items));
        Knapsack01 kp = new Knapsack01(knapsack_capacity, fin);
        System.out.printf("Knapsack01 (capacity = %d) is initialized for %d items\n", knapsack_capacity, kp.getNumItems());
        fin.close();
        System.out.printf(" Processing to obtain best solution by bruteforce() :\n ");
        sol = kp.BruteForce_KP01();
        System.out.printf("Solution obtained by bruteforce() :\n ");
        kp.printSolution(sol);
        System.out.printf(" Processing to obtain best solution by DynKSP_BottomUp() :\n ");
        sol = kp.DynKSP_BottomUp();
        System.out.printf("Solution obtained by DynKSP_BottomUp() :\n ");
        kp.printSolution(sol);
        System.out.printf(" Processing to obtain best solution by DynKSP_TopDown() :\n ");
        sol = kp.DynKSP_TopDown();
        System.out.printf("Solution obtained by DynKSP_TopDown() :\n ");
        kp.printSolution(sol);
    }
}
