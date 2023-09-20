package ch04_2_3_Inheritance_Shape_Drawings;

public class Prism extends Triangle{
    private int height;
    public Prism(String color, String nm, int cx, int cy, int ang, int base, int tri_height, int height) {
        super(color, nm, cx, cy, ang, base, tri_height);
        this.height = height;
    }
    public void print() {
        System.out.printf("Prism ("); super.print();
        System.out.printf(", height = %d)", this.height);
    }

}
