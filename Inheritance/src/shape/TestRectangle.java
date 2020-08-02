package shape;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(3,4);
        System.out.println(rectangle);
        System.out.println("Area of rectangle is: "+rectangle.getArea());
        System.out.println("Perimeter of rectangle is: "+rectangle.getPerimeter());

        rectangle = new Rectangle(4,5,"Blue",false);
        System.out.println(rectangle);
        System.out.println("Area of rectangle is: "+rectangle.getArea());
        System.out.println("Perimeter of rectangle is: "+rectangle.getPerimeter());
    }
}
