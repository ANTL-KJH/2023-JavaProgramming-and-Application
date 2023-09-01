package ch03_2_3_Class_Planet_Ex;

public class Class_Planet {
    public static class Planet {
        private String name; // 데이터 멤버
        private double relativeMass; // 데이터 멤버
        private double distance; // 데이터 멤버
        public Planet() { } // default constructor
        public Planet(String nm, double rm, double dist) {
            this.name = nm;
            this.relativeMass = rm;
            this.distance = dist;
        }
        public void print() {
            System.out.printf("Planet(%8s, %10.5f, %8.2f)", this.name, this.relativeMass, this.distance);
        }
    }

}
