package ch06_6_4_TreeMap;

public class NumPrfx {
    private double key;
    private String value;

    NumPrfx(double k, String v)
    {
        this.key = k;
        this.value = v;
    }
    public double getValue()
    {
        return this.key;
    }
    public String getPrefix()
    {
        return this.value;
    }
}
