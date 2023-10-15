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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App_KnapsackProblem01 {
    public static void main(String[] args) throws IOException {
        KSP_Solution sol;
        int knapsack_capacity = 20;

        // file path
        final String f_items = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\HW\\HW07\\HW07.1\\KSP_items.txt";
        final String fout_name = "C:\\Users\\ANTL\\Desktop\\GitHub\\2023-JavaProgramming-and-Application\\HW\\HW07\\HW07.1\\KSP_solution.txt";

        // Scanner and Writer
        Scanner fin = new Scanner(new File(f_items));
        FileWriter fout = new FileWriter(fout_name);

        Knapsack01 kp = new Knapsack01(knapsack_capacity, fin); // gen Knapsack instance
        System.out.printf("Knapsack01 (capacity = %d) is initialized for %d items\n", knapsack_capacity, kp.getNumItems());
        fin.close();
        fout.write("Processing to obtain best solution by bruteforce() :\n");
        sol = kp.BruteForce_KP01(); // BruteForce Knapsack
        System.out.printf("Solution obtained by bruteforce() :\n");
        kp.printSolution(sol);  // print out
        fout.write("Solution obtained by bruteforce() :\n");
        kp.fprintSolution(fout, sol);   // print to file
        fout.write("Processing to obtain best solution by DynamicProgramming() :\n");
        sol = kp.DynProg_KP01();    // Dynamic Programming Knapsack
        System.out.printf("Solution obtained by DynamicProgramming() :\n");
        kp.printSolution(sol);
        fout.write("Solution obtained by DynamicProgramming() :\n");
        kp.fprintSolution(fout, sol);
        System.out.printf("Knapsack01 (capacity = %d) solution is stored in file %s.\n",knapsack_capacity, fout_name);
        fout.close();
    }
}
