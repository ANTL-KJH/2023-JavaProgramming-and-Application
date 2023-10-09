package ch06_5_2_PrioryityQueue_Entry;
import java.util.PriorityQueue;
public class App_PriorityQueue_Entry {
    public static void main(String[] args) {
        PriorityQueue<PriEntry> priQ_PriEntry = new PriorityQueue<PriEntry>();
        PriEntry[] PriEntry_array = {new PriEntry(9, "Nine"), new PriEntry(8, "Eight"), new PriEntry(7, "Seven"),
                new PriEntry(6, "Six"), new PriEntry(5, "Five"), new PriEntry(4, "Four"),
                new PriEntry(3, "Three"), new PriEntry(2, "Two"), new PriEntry(1, "One"), new PriEntry(0, "Zero")};
        for (PriEntry e : PriEntry_array) {
            priQ_PriEntry.add(e);
            System.out.printf("Inserting(%s) => %s\n", e.toString(), priQ_PriEntry);
        }
        PriEntry ent;
        int num_PriEntry = priQ_PriEntry.size();
        for (int i=0; i<num_PriEntry; i++) {
            ent = priQ_PriEntry.poll();
            System.out.printf("After poll %s => %s\n",
                    ent.toString(), priQ_PriEntry);
        }
    }
}
