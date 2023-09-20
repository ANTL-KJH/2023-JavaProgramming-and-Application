package I_Animation_Shape;

public class Polygon extends Shape{
    private int radius;
    private int num_vertices;
    public Polygon(String color, String nm, int cx, int cy, int angle, int radius, int num_vertices) {
        super(color, nm, cx, cy, angle);
        this.radius = radius;
        this.num_vertices = num_vertices;
    }
    public void print() {
        System.out.printf("Polygon ("); super.print();
        System.out.printf(", radius = %d, num_vertices = %d)", this.radius, this.num_vertices);
    }
    @Override
    public void move(int dx, int dy) {
        System.out.printf("Polygon:: move(dx=%d, dy=%d)...", dx, dy);
        this.move_posxy(dx, dy);
    }
    @Override
    public void rotate(int d_angle) {
        System.out.printf("Polygon:: rotate(d_angle = %d)...", d_angle);
        this.rotate_angle(d_angle);
    }
}
