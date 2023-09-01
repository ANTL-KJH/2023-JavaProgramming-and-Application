package ch03_4_2_class_Object_Point_toString;

public class Point {
    private int x, y; // coordinate
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
