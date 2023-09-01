package ch03_3_4_Planet_Array_Solar_System;

public class App_Planet {
    public static void main(String[] args) {
        Class_Planet[] solarSystem = {
                new Class_Planet("Mercury", 0.0558, 57.9),
                new Class_Planet("Venus", 0.815, 108),
                new Class_Planet("Earth",1.0, 150),
                new Class_Planet("Mars", 0.107, 228),
                new Class_Planet("Jupiter", 318, 778),
                new Class_Planet("Saturn", 95.1, 1430),
                new Class_Planet("Uranus", 14.5, 2870),
                new Class_Planet("Neptune", 17.2, 4500),
                new Class_Planet("Pluto", 0.11, 5900)
        };
        int num_planets = solarSystem.length;
        for (int i=0; i<num_planets; i++) {
            solarSystem[i].print();
            System.out.printf("\n");
        }
    }
}
