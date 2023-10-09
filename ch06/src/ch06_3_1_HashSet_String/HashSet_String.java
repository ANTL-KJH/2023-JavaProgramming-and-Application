package ch06_3_1_HashSet_String;
import java.util.*;
public class HashSet_String {
    public static void main(String[] args) {
        HashSet<String> car_makers = new HashSet<>();
        car_makers.add("Hyundai");
        car_makers.add("Kia");
        car_makers.add("Ford");
        car_makers.add("Toyota");
        car_makers.add("Volvo");
        car_makers.add("BMW");
        car_makers.add("BMW");
        car_makers.add("BMW");
        car_makers.add("Kia");
        car_makers.add("Kia");
        System.out.println("car_makers (size : " + car_makers.size() + ") = " + car_makers);
        car_makers.remove("BMW");
        System.out.println("after remove(BMW), car_makers (size : " + car_makers.size() + ") = " + car_makers);
        car_makers.remove("Kia");
        System.out.println("after remove(Kia), car_makers (size : " + car_makers.size() + ") = " + car_makers);
    }
}
