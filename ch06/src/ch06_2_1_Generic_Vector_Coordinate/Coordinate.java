package ch06_2_1_Generic_Vector_Coordinate;



class Coordinate {
    private int x,y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "Coordinate(" + x + ", " + y + ")";
    }
}
