package shape;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);
        System.out.println("Area is: "+circle.getArea());
        System.out.println("Perimeter is: "+circle.getPerimeter());

        circle = new Circle(3.5 , "indigo" , false);
        System.out.println(circle);
        System.out.println("Area is: "+circle.getArea());
        System.out.println("Perimeter is: "+circle.getPerimeter());

    }
}
