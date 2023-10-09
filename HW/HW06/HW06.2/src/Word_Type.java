public class Word_Type {
    private String word;
    private String type;
    Word_Type(String w, String t)
    {
        this.word = w;
        this.type = t;
    }
    public String toString()
    {
        return "%s_%s".formatted(this.word, this.type);
    }
}
