package Geometry;

public class Square extends Shape {
    private double side = 1.0;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
}
