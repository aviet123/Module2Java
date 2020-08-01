package circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    protected double getRadius() {
        return radius;
    }

    protected String getColor() {
        return color;
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected void setColor(String color) {
        this.color = color;
    }
}
