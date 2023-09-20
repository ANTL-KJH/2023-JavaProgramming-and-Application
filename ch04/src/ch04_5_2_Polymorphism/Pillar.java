package ch04_5_2_Polymorphism;

public class Pillar extends Rectangle {
    private int height;
    public Pillar(String color, String nm, int cx, int cy, int ang, int width, int length, int height) {
        super(color, nm, cx, cy, ang, width, length);
        this.height = height;
    }
    public void print() {
        System.out.printf("Pillar ("); super.print();
        System.out.printf(", height = %d)", this.height);
    }
}
