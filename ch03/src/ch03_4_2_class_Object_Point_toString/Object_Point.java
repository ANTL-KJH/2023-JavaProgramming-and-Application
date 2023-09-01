package ch03_4_2_class_Object_Point_toString;

public class Object_Point {
    public static void print(Object obj) {
        System.out.printf("obj.getClass().getTypeName() = %s\n",
                obj.getClass().getTypeName());
        System.out.printf("obj.hashCode() = %d\n", obj.hashCode());
        System.out.printf("obj.toString() = %s\n", obj.toString());
        System.out.printf("obj = %s\n", obj);
    }
    public static void main(String[] args) {
        Point p = new Point(3, 5);
        print(p);
    }
}
