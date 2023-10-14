/**
 * Project Name : JavaProgramming and Application HW06.2
 * Program's purpose and basic function :
 * - class Thesaurus
 * Program First Author : JH KIM
 * Date of First Write : 2023.10.09
 * =======================================================================================================
 * Source Code Modification History
 * =======================================================================================================
 * Author				Date				Ver				Modification details
 * JH KIM				2023.10.09			v1.00			First Write
 */
import java.util.ArrayList;

public class Thesaurus {
    // member data
    private String keyword;
    private String type;
    private ArrayList<String> list_thesaurus;
    // constructor
    Thesaurus()
    {
        list_thesaurus = new ArrayList<String>();
    }
    // mutator
    public void setKeyWord(String keyword) {
        this.keyword = keyword;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void addThesaurus(String word)
    {
        list_thesaurus.add(word);
    }

    // return String
    public String toString()
    {
        // key + type + thesaurus
        String str = "%s [%s] : {".formatted(this.keyword, this.type);
        for (int i =0; i<this.list_thesaurus.size();i++)
        {
            str += list_thesaurus.get(i);
            str += ", ";
        }
        str += "}";
        return str;
    }
}
