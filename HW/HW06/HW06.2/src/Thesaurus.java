import java.util.ArrayList;

public class Thesaurus {
    private String keyword;
    private String type;
    private ArrayList<String> list_thesaurus;
    Thesaurus()
    {
        list_thesaurus = new ArrayList<String>();
    }
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
    public String toString()
    {
        String str = "{";
        for (int i =0; i<this.list_thesaurus.size();i++)
        {
            str += list_thesaurus.get(i);
            str += ", ";
        }
        str += "}";
        return str;
    }
}
