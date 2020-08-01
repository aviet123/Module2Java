package Fan;

class FanStructure {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed = SLOW;
    private boolean On = false;
    private double radius = 5;
    private String color = "blue";

    FanStructure(){

    }

    public boolean isOn() {
        return On;
    }
    public double getRadius() {
        return radius;
    }
    public int getSpeed() {
        return speed;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        On = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "FanStructure{" +
                "SLOW=" + SLOW +
                ", MEDIUM=" + MEDIUM +
                ", FAST=" + FAST +
                ", speed=" + speed +
                ", On=" + On +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
