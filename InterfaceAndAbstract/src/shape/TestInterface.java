package shape;

public class TestInterface {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4.5,5.5);
        rectangle.resize(Math.floor(Math.random()*100+1));
        System.out.print(rectangle);

        System.out.println();
        System.out.println("-------------------------------");

        Circle circle = new Circle(4);
        circle.resize(Math.floor(Math.random()*100+1));
        System.out.println(circle);

        System.out.println();
        System.out.println("-------------------------------");

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(4,5);
        shapes[2] = new Square(5);
        shapes[1] = new Circle();


        for (Shape shape : shapes){
            if (shape instanceof Square){
                ((Square) shape).resize(Math.floor(Math.random()*100+1));
                System.out.println(shape);
            }
            if (shape instanceof Colorable){
                ((Colorable) shape).howToColor();
                System.out.println(shape);
            }
        }



    }
}
