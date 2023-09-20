package ch04_5_2_Polymorphism;

public class Cylinder extends Circle {
    private int height;
    public Cylinder(String color, String nm, int cx, int cy, int ang, int radius, int height) {
        super(color, nm, cx, cy, ang, radius);
        this.height = height;
    }
    public void print() {
        System.out.printf("Cylinder ("); super.print();
        System.out.printf(", height = %d)", this.height);
    }
}
