package circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Area is: "+ circle.getArea());
        System.out.println("Perimeter is: "+ circle.getPerimeter());

        circle = new Circle(3,"yellow");
        System.out.println(circle);
        System.out.println("Area is: "+ circle.getArea());
        System.out.println("Perimeter is: "+ circle.getPerimeter());
    }
}
