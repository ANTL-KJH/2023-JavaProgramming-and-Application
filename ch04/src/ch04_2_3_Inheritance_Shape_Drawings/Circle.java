package ch04_2_3_Inheritance_Shape_Drawings;

public class Circle extends Shape {
    private int radius;
    public Circle(String color, String nm, int cx, int cy, int ang, int radius) {
        super(color, nm, cx, cy, ang);
        this.radius = radius;
    }
    public void print() {
        System.out.printf("Circle ("); super.print();
        System.out.printf(", radius = %d)", this.radius);
    }

}
