package ch04_2_3_Inheritance_Shape_Drawings;

public class App_Shape_Upcasting {
    public static void main(String[] args) {
        Shape shp1 = new Shape("Red", "Shape", 0, 0, 0);
        Circle cir = new Circle("Blue", "Circle", 1, 1, 1, 1);
        Cylinder cyl = new Cylinder("Black", "Cylinder", 1, 1, 1, 1, 10);
        shp1.print(); System.out.println();
        if (shp1 instanceof Shape) {
            System.out.println("shp1 is an instanceof Shape\n");
        } else {
            System.out.println("shp1 is not an instanceof Shape\n");
        }
        Shape shp2 = cir; //upcasting
        shp2.print(); System.out.println();
        if (shp2 instanceof Circle) {
            System.out.println("shp2 is an instanceof Circle\n");
        } else {
            System.out.println("shp2 is not an instanceof Circle\n");
        }
    }
}
