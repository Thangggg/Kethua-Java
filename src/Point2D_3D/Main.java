package Point2D_3D;

public class Main {
    public static void main(String[] args) {
        Point2D test1 = new Point2D(5,10);
        System.out.println(test1);
        Point2D test2 = new Point3D(10,15,20);
        System.out.println(test2);
        Point2D test3 = new Point2D(10,15);
        System.out.println(test3);
        Point3D test4 = new Point3D(5,10,20);
        System.out.println(test4);
        test4.setXY(1,6);
        System.out.println(test4);



    }
}
