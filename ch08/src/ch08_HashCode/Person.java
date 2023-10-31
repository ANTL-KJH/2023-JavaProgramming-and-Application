package ch08_HashCode;

public class Person {
    private int reg_id;
    private String name;
    public Person(int rgID, String nm) {
        this.reg_id = rgID;
        this.name = nm;
    }
    public String toString() {
        String str = String.format("(%5d, %6s)", this.reg_id, this.name);
        return str;
    }
    public boolean equals(Person other) {
        if ((this.reg_id == other.reg_id) && (this.name.equals(other.name))) {
            return true;
        } else
            return false;
    }
}