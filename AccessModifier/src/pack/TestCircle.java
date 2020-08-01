package pack;

import circle.Circle;

class TestCircle extends Circle {
    public static void main(String[] args) {
        TestCircle c1 = new TestCircle();
        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
        c1.setColor("yellow");
        c1.setRadius(2.0);
        System.out.println(c1.getColor());
        System.out.println(c1.getRadius());
    }
}
