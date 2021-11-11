package Circle_Cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {

    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color) {
        super(radius, color);
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolumetric() {
       return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return " Diện tích hình trụ với chiều cao:  "
                + getHeight()
                + " là :  "
                + getVolumetric();
    }


}
