package ch03_4_3_class_Object_Point_equals;

public class Object_Point_equals {
    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = new Point(3, 5);
        if (a == b)
            System.out.println("a == b");
        if (a.equals(b))
            System.out.println("a is equal to b");
        if (a.equals(c))
            System.out.println("a is equal to c");
    }
}
