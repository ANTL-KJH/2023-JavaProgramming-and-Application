/**
 * Project Name : JavaProgramming and Application HW06.1
 * Program's purpose and basic function :
 * - class Person
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.09
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.09			v1.00			First Write
 */
public class Person {
    // member data
    private String name;
    private TelNum telNum;
    // constructor
    Person(String nm, TelNum tNum)
    {
        this.name = nm;
        this.telNum = tNum;
    }
    // return string
    public String toString()
    {
        return "Person(name= %5s, telNo=%16s)".formatted(this.name, this.telNum);
    }
    // accessor
    public String getName()
    {
        return this.name;
    }
}
