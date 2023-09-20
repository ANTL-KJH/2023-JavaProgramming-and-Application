package I_Animation_Shape;

public class Cylinder extends Circle{
    private int height;
    public Cylinder(String color, String nm, int cx, int cy, int angle, int radius, int height) {
        super(color, nm, cx, cy, radius, angle);
        this.height = height;
    }
    public void print() {
        System.out.printf("Cylinder ("); super.print();
        System.out.printf(", height = %d)", this.height);
    }
    @Override
    public void move(int dx, int dy) {
        System.out.printf("Cylinder:: move(dx=%d, dy=%d)...", dx, dy);
        this.move_posxy(dx, dy);
    }
    @Override
    public void rotate(int d_angle) {
        System.out.printf("Cylinder:: rotate(d_angle = %d)...", d_angle);
        this.rotate_angle(d_angle);
    }

}
