/**
 * Project Name : JavaProgramming and Application HW05.1
 * Program's purpose and basic function :
 * - class Person
 * Program First Author : JH KIM
 * Date of First Write : 2023.09.22
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.09.22			v1.00			First Write
 */
public class Person{
    private String name;

    private int reg_id;

    Person(String nm, int reg_id)   // constructor
    {
        this.name = nm;
        this.reg_id = reg_id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getReg_id()
    {
        return this.reg_id;
    }
}
