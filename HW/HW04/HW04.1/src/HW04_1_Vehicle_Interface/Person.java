/**
 * Project Name : JavaProgramming and Application HW04.1
 * Program's purpose and basic function :
 * - class person
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.18
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.18			v1.00			First Write
 * JH KIM               2023.09.22          v1.01           toString modified
 */
package HW04_1_Vehicle_Interface;

public class Person {
    private String name;
    private int reg_ID;
    static int num_person;
    public Person() { } // default constructor
    public Person(String nm, int reg_ID) {
        this.name = nm;
        this.reg_ID = reg_ID;
        num_person += 1;
    }
    public void print() {
        System.out.printf("Person(name: %s, reg_id: %d)",
                this.name, this.reg_ID);
    }
    public String toString()
    {
        return "Person(name: %s, reg_id: %d)".formatted(this.name, this.reg_ID);
    }
    public String getName()
    {
        return this.name;
    }
}
