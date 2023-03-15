package lap6.ex1_3;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0f, 2.0f);
        System.out.println(point2D);
        System.out.println("x = " + point2D.getX());
        System.out.println("y = " + point2D.getY());

        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D.setX(6.0f);
        point3D.setY(5.0f);
        point3D.setZ(4.0f);
        System.out.println(point3D);
        System.out.println("x = " + point3D.getX());
        System.out.println("y = " + point3D.getY());
        System.out.println("z = " + point3D.getZ());
    }
}
