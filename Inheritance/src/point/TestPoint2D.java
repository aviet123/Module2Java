package point;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(3.0f,2.5f);
        System.out.println(point2D);
        for (int i = 0; i < point2D.getXY().length; i++) {
            System.out.println(point2D.getXY()[i]);
        }

        point2D = new Point2D(3.5f,4.6f);
        System.out.println(point2D);
        for (int i = 0; i < point2D.getXY().length; i++) {
            System.out.println(point2D.getXY()[i]);
        }
    }
}
