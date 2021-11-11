package Geometry;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.0);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", false, 5.0, 7.0);
        System.out.println(rectangle);
    }
}
