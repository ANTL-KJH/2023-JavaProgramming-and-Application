package ch03_3_4_Planet_Array_Solar_System;

public class Class_Planet {
    private String name; // 데이터 멤버
    private double relativeMass; // 데이터 멤버
    private double distance; // 데이터 멤버
    public Class_Planet()
    { } // default constructor
    public Class_Planet(String nm, double rm, double dist) {
        this.name = nm;
        this.relativeMass = rm;
        this.distance = dist;
    }
    public void print() {
        System.out.printf("Planet(%8s, %10.5f, %8.2f)",
                this.name, this.relativeMass, this.distance);
    }
}

