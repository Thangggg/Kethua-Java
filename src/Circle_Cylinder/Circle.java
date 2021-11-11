package Circle_Cylinder;

public class Circle {
    private double radius = 5;
    private String color = "Red";

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea () {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return " Bán kính đường tròn : "
                + getRadius()
                + " Diện tích đường tròn : "
                + getArea();
    }
}
