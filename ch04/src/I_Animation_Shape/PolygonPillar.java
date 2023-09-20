package I_Animation_Shape;

public class PolygonPillar extends Polygon{
    private int height;
    public PolygonPillar(String color, String nm, int cx, int cy, int angle, int radius, int num_vertices, int height) {
        super(color, nm, cx, cy, angle, radius, num_vertices);
        this.height = height;
    }
    public void print() {
        System.out.printf("PolygonPillar ("); super.print();
        System.out.printf(", height = %d)", this.height);
    }
    @Override
    public void move(int dx, int dy) {
        System.out.printf("PolygonPillar:: move(dx=%d, dy=%d)...", dx, dy);
        this.move_posxy(dx, dy);
    }
    @Override
    public void rotate(int d_angle) {
        System.out.printf("PolygonPillar:: rotate(d_angle = )...", d_angle);
        this.rotate_angle(d_angle);
    }
}
