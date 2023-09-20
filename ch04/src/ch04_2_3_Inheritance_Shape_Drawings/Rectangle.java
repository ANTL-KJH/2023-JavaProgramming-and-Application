package ch04_2_3_Inheritance_Shape_Drawings;

public class Rectangle extends Shape{
    private int width;
    private int length;
    public Rectangle(String color, String nm, int cx, int cy, int ang, int width, int length) {
        super(color, nm, cx, cy, ang);
        this.width = width;
        this.length = length;
    }
    public void print() {
        System.out.printf("Rectangle ("); super.print();
        System.out.printf(", width = %d, length = %d)", this.width, this.length);
    }
}
