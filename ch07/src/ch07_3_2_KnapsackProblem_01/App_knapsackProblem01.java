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
        printSolution(sol);
        System.out.print(" Processing to obtain best solution by DynamicProgramming() :\n ");
        sol = kp.DynProg_KP01();
        System.out.print("Solution obtained by DynamicProgramming() :\n ");
        printSolution(sol);
    }
    public static void printSolution(KSP_Solution sol) {
        System.out.printf("total value = %d, total weight = %d, selected items = [", sol.totalValue, sol.totalWeight);
        int num_items = sol.selectedItems.size();
        for (int i=0; i<num_items; i++) {
            System.out.printf("%s", sol.selectedItems.get(i));
            if (i != (num_items -1)) {
                System.out.printf(", ");
            } else {
                System.out.printf("]\n");
            }
        }
    }
}
