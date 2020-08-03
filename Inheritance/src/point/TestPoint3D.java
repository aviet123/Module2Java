package point;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        for (int i = 0; i < point3D.getXYZ().length; i++) {
            System.out.println(point3D.getXYZ()[i]);
        }
        point3D = new Point3D(4.5f,3.5f,4.6f);
        System.out.println(point3D);
        for (int i = 0; i < point3D.getXYZ().length; i++) {
            System.out.println(point3D.getXYZ()[i]);
        }

    }
}
