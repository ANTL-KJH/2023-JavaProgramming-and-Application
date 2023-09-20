package I_Animation_Shape;

public class Circle extends Shape{
    private int radius;
    public Circle(String color, String nm, int cx, int cy, int angle, int radius) {
        super(color, nm, cx, cy, angle);
        this.radius = radius;
    }
    public void print() {
        System.out.printf("Circle ("); super.print();
        System.out.printf(", radius = %d)", this.radius);
    }
    @Override
    public void move(int dx, int dy) {
        System.out.printf("Circle:: move(dx=%d, dy=%d)...", dx, dy);
        this.move_posxy(dx, dy);
    }
    @Override
    public void rotate(int d_angle) {
        System.out.printf("Circle:: rotate(d_angle = %d )...", d_angle);
        this.rotate_angle(d_angle);
    }
}
