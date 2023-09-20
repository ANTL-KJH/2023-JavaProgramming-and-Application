package ch04_5_2_Polymorphism;


public class App_Shpe_Drawings {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Shape("Red", "Shape", 0, 0, 0),
                new Circle("Blue", "Circle", 1, 1, 1, 1),
                new Triangle("Green", "Triangle", 2, 2, 2, 2, 2),
                new Rectangle("Brown", "Rectangle", 3, 3, 3, 3, 3),
                new Cylinder("Black", "Cylinder", 1, 1, 1, 1, 10),
                new Prism("Purple", "Prism", 2, 2, 2, 2, 2, 20),
                new Pillar("Magenta", "Pillar", 3, 3, 3, 3, 3, 30)
        };
        int num_shapes = shapes.length;
        for (int i=0; i<num_shapes; i++) { // 하나의 반복문으로 다양한 도형들을 관리
            shapes[i].print();
            System.out.println();
        }
    }
}
