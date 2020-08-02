package circle;

public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder(){

    }
    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * height;
    }
    public double getVolume(){
        return super.getArea()* this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + getHeight() +
                " which is subclass of " + super.toString();
    }
}
