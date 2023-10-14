/**
 * Project Name : JavaProgramming and Application HW06.2
 * Program's purpose and basic function :
 * - class Word_Type
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.09
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.09			v1.00			First Write
 */
public class Word_Type {
    // data member
    private String word;
    private String type;

    // constructor
    Word_Type(String w, String t)
    {
        this.word = w;
        this.type = t;
    }
    //return String
    public String toString()
    {
        return "%s_%s".formatted(this.word, this.type);
    }
}
