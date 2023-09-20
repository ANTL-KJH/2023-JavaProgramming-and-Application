package ch04_5_2_Polymorphism;

public class Triangle extends Shape {
    private int base;
    private int height;
    public Triangle(String color, String nm, int cx, int cy, int ang, int base, int height) {
        super(color, nm, cx, cy, ang);
        this.base = base;
        this.height = height;
    }
    public void print() {
        System.out.printf("Triangle ("); super.print();
        System.out.printf(", base = %d, height = %d)", this.base, this.height);
    }
}
