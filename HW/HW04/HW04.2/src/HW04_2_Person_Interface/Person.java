/**
 * Project Name : JavaProgramming and Application HW04.2
 * Program's purpose and basic function :
 * - class Person
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.18
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.18			v1.00			First Write
 */
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
