public class Person {

    private String name;
    private TelNum telNum;
    Person(String nm, TelNum tNum)
    {
        this.name = nm;
        this.telNum = tNum;
    }
    public String toString()
    {
        return "Person(name= %5s, telNo=%16s)".formatted(this.name, this.telNum);
    }
    public String getName()
    {
        return this.name;
    }
}
