package I_Animation_Shape;

public class App_Polymorphism_Shape {
    public static void main(String[] args) {
        Circle cir = new Circle("Blue", "Circle", 1, 1, 1, 1);
        Polygon poly = new Polygon("Green", "Polygon", 2, 2, 2, 2, 2);
        Cylinder cyl = new Cylinder("Black", "Cylinder", 1, 1, 1, 1, 10);
        PolygonPillar polyPlr = new PolygonPillar("Magenta", "PolygonPillar", 3, 3, 3, 3, 3, 30);
        Shape[] shapes = {cir, poly, cyl, polyPlr};
        System.out.printf("\nShapes with polymorphism :\n");
        for (Shape s : shapes) {
            s.print(); System.out.println();
        }
        System.out.printf("\nMoving shapes with polymorphism :\n");
        for (Shape s : shapes) {
            s.move(1, 2); System.out.println();
        }
        System.out.printf("\nRotating shapes with polymorphism :\n");
        for (Shape s : shapes) {
            s.rotate(5); System.out.println();
        }
    }
}
