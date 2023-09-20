package I_Animation_Shape;

public abstract class Shape implements I_Animation{
    private String name;
    private int cx; // center position x
    private int cy; // center position x
    private int angle;
    private String color;
    public Shape(String color, String nm, int cx, int cy, int angle) {
        this.name = nm;
        this.cx = cx;
        this.cy = cy;
        this.angle = angle;
        this.color = color;
    }
    protected void move_posxy(int dx, int dy) {
        this.cx += dx;
        this.cy += dy;
    }
    protected void rotate_angle(int d_angle) {
        this.angle += d_angle;
    }
    public void print() {
        System.out.printf("Shape(color=%s, name=%s, cx=%d, cy=%d)",
                this.color, this.name, this.cx, this.cy);
    }
}
