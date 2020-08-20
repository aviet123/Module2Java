package shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape a1 = shapeFactory.getShape("Circle");
        a1.draw();
        Shape a2 = shapeFactory.getShape("Rectangle");
        a2.draw();
        Shape a3 = shapeFactory.getShape("Square");
        a3.draw();
    }
}
