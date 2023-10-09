package ch06_6_3_HashMap_InterCityDistanceTable;
import java.util.Objects;
public class CityPair {
    private String city_1;
    private String city_2;
    public CityPair(String c1, String c2) {
        this.city_1 = c1;
        this.city_2 = c2;
    }
    public String getCity1() {
        return this.city_1;
    }
    public String getCity2() {
        return this.city_2;
    }
    public String toString() {
        String str = String.format("(%s, %s)", this.city_1, this.city_2);
        return str;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if(o == null || getClass() != o.getClass()) return false;
        CityPair other = (CityPair)o;
        return (other.city_1.equals(this.city_1)) && (other.city_2.equals(this.city_2));
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.city_1, this.city_2); // import java.util.Objects; 가 필요함
    }
}
