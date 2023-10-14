package ch07_3_2_KnapsackProblem_01;

import java.util.ArrayList;

public class Knapsack01 {
    Item[] items;
    int capacity;
    public Knapsack01(Item[] items, int capacity) {
        this.items = items;
        this.capacity = capacity;
    }
    public KSP_Solution BruteForce_KP01() {
        ArrayList<ArrayList<Item>> powerSet = new ArrayList<ArrayList<Item>>();
        ArrayList<Item> subSet_items;
        String binStr;
        int num_items = this.items.length;
        for (int i=0; i< Math.pow(2, num_items); i++) {
            binStr = Integer.toBinaryString(i);
            if (binStr.length() > num_items) {
                System.out.printf("getBinaryRepr::num_digits is not enough !!");
            } int binStr_length =
                    binStr.length();
            for (int j=0; j < (num_items - binStr_length); j++) {
                binStr = "0" + binStr; // fill the spaces in front with '0'
            }
            subSet_items = new ArrayList<Item>();
            for (int j=0; j<num_items; j++) {
                if (binStr.charAt(j) == '1') {
                    subSet_items.add(this.items[j]);
                }
            }
            powerSet.add(subSet_items);
        }
        int bestSubsetValue = 0, bestSubsetWeight = 0;
        int subsetValue, subsetWeight;
        ArrayList<Item> bestSubset = null;
        for (ArrayList<Item> subSet : powerSet ) {
            subsetValue = 0;
            subsetWeight = 0;
            for (Item e : subSet) {
                subsetValue += e.value;
                subsetWeight += e.weight;
            } if ((subsetWeight <= this.capacity) && (
                    subsetValue >
                            bestSubsetValue)) {
                bestSubsetValue = subsetValue;
                bestSubset = subSet;
                bestSubsetWeight = subsetWeight;
            }
        }
        KSP_Solution solution = new KSP_Solution();
        solution.selectedItems = bestSubset;
        solution.totalValue = bestSubsetValue;
        solution.totalWeight = bestSubsetWeight;
        return solution;
    }
    public KSP_Solution DynProg_KP01() {
        KSP_Solution[][] m = new KSP_Solution[this.items.length + 1][this.capacity + 1];
        for (int i=0; i<= this.items.length; i++) {
            for (int w=0; w<= this.capacity; w++) {
                m[i][w] = new KSP_Solution();
                m[i][w].selectedItems = new ArrayList<Item>();
            }
            m[i][0].totalValue = 0;
            m[i][0].totalWeight = 0;
        }
        for (int w=0; w<= this.capacity; w++) {
            m[0][w].totalValue = 0;
            m[0][w].totalWeight = 0;
        }
        for (int i=1; i<=this.items.length; i++) {
            for (int w=1; w<=this.capacity; w++) {
                if (this.items[i-1].weight > w) {
                    m[i][w] = m[i-1][w]; // items[i] is excluded
                } else {
                    if (m[i-1][w].totalValue > (m[i-1][w - this.items[i-1].weight].totalValue + this.items[i-1].value)) {
                        m[i][w] = m[i-1][w];
                    } else {
                        m[i][w].selectedItems.addAll(m[i-1][w].selectedItems);
                        m[i][w].selectedItems.add(this.items[i-1]);
                        m[i][w].totalValue = m[i-1][w - this.items[i-1].weight].totalValue + this.items[i-1].value;
                        m[i][w].totalWeight = m[i-1][w - this.items[i-1].weight].totalWeight + this.items[i-1].weight;
                    }
                }
            }
        }
        KSP_Solution solution = new KSP_Solution();
        solution = m[this.items.length][this.capacity];
        return solution;
    }
}
