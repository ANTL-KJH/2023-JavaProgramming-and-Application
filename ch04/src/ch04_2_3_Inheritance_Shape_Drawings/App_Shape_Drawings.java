package ch04_2_3_Inheritance_Shape_Drawings;

public class App_Shape_Drawings {
    public static void main(String[] args) {
        Shape shp = new Shape("Red", "Shape", 0, 0, 0);
        Circle cir = new Circle("Blue", "Circle", 1, 1, 1, 1);
        Triangle tri = new Triangle("Green", "Triangle", 2, 2, 2, 2, 2);
        Rectangle rec = new Rectangle("Brown", "Rectangle", 3, 3, 3, 3, 3);
        Cylinder cyl = new Cylinder("Black", "Cylinder", 1, 1, 1, 1, 10);
        Prism prm = new Prism("Purple", "Prism", 2, 2, 2, 2, 2, 20);
        Pillar plr = new Pillar("Magenta", "Pillar", 3, 3, 3, 3, 3, 30);
        shp.print(); System.out.println();
        cir.print(); System.out.println();
        tri.print(); System.out.println();
        rec.print(); System.out.println();
        cyl.print(); System.out.println();
        prm.print(); System.out.println();
        plr.print(); System.out.println();
    }

}
