package ch04_5_2_Polymorphism;

public class Shape {
    private String name;
    private int cx; // center position x
    private int cy; // center position x
    private int angle; // angle of shape
    private String color;
    public Shape(String color, String nm, int cx, int cy, int angle) {
        this.name = nm;
        this.cx = cx;
        this.cy = cy;
        this.angle = angle;
        this.color = color;
    }
    public void print() {
        System.out.printf("Shape(color=%s, name=%s, cx=%d, cy=%d, ang=%d)",
                this.color, this.name, this.cx, this.cy, this.angle);
    }

}
