package moveablepoint;

public class TestPoint {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);
        point.setXY(2.0f,3.5f);
        for (int i = 0; i < point.getXY().length; i++) {
            System.out.println(point.getXY()[i]);
        }

        point = new Point(3.4f,4.5f);
        System.out.println(point);
        float[] arrs = point.getXY();
        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
    }
}
