package ch06_5_2_PrioryityQueue_Entry;

public class PriEntry {
    private int priority;
    private String data;
    public PriEntry(int pri, String data) {
        this.priority = pri;
        this.data = data;
    }
    public int compareTo(PriEntry other) {
        return (this.priority - other.priority);
    }
    public String toString() {
        String str = String.format("(%d, %s)", this.priority, this.data);
        return str;
    }
}
