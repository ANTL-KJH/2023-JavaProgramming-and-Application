package ch07_3_2_KnapsackProblem_01;

public class App_knapsackProblem01 {
    static Item[] items = {
            new Item("clock", 175, 10), new Item("painting", 90, 9), new Item("radio", 20, 4), new Item("vase", 50, 2),
            new Item("book", 10, 1), new Item("computer", 200, 20)
    };
    public static void main(String[] args) {
        int knapsack_capacity = 20;
        Knapsack01 kp = new Knapsack01(items, knapsack_capacity);
        KSP_Solution sol;
        System.out.print(" Processing to obtain best solution by bruteforce() :\n ");
        sol = kp.BruteForce_KP01();
        System.out.print("Solution obtained by bruteforce() :\n ");
        kp.printSolution(sol);
        System.out.print(" Processing to obtain best solution by DynamicProgramming() :\n ");
        sol = kp.DynKSP_BottomUp();
        System.out.print("Solution obtained by DynamicProgramming() :\n ");
        kp.printSolution(sol);
        System.out.printf(" Processing to obtain best solution by DynKSP_TopDown() :\n ");
        sol = kp.DynKSP_TopDown();
        System.out.printf("Solution obtained by DynKSP_TopDown() :\n ");
        kp.printSolution(sol);
    }
}
