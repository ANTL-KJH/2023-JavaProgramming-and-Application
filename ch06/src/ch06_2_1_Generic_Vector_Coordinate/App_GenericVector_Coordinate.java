package ch06_2_1_Generic_Vector_Coordinate;
import java.util.Vector;
public class App_GenericVector_Coordinate {
    public static void main(String[] args) {
        Vector<Coordinate> vc = new Vector<Coordinate>();
        vc.add(new Coordinate(0, 0));
        vc.add(new Coordinate(-100, 100));
        vc.add(new Coordinate(100, 100));
        vc.add(new Coordinate(100, -100));
        vc.add(new Coordinate(-100, -100));
        for(int i=0; i<vc.size(); i++) {
            Coordinate coord = vc.get(i);
            System.out.println(coord);
        }
    }
}
