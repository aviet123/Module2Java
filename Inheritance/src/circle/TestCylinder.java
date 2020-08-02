package circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("area of cylinder is: "+cylinder.getArea());
        System.out.println("volume of cylinder is: "+cylinder.getVolume());

        cylinder = new Cylinder(4.0,"red",5.0);
        System.out.println(cylinder);
        System.out.println("area of cylinder is: "+cylinder.getArea());
        System.out.println("volume of cylinder is: "+cylinder.getVolume());
    }
}
