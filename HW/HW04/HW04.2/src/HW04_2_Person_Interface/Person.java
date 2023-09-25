package HW04_2_Person_Interface;

public abstract class Person implements PersonActivity{
    private String name; // data member
    private int reg_id; // registration ID
    public Person(String nm, int reg_id) {
        this.name = nm;
        this.reg_id = reg_id;
    }
    public String getName() {
        return this.name;
    }
    public int getReg_id() {
        return this.reg_id;
    }
}
