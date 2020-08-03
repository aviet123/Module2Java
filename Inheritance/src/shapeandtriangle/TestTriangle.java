package shapeandtriangle;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1,side2,side3;

        System.out.println("nhập canh a: ");
        side1 = scanner.nextDouble();
        System.out.println("nhập canh b: ");
        side2 = scanner.nextDouble();
        System.out.println("nhập canh c: ");
        side3 = scanner.nextDouble();


        Triangle triangle = new Triangle(side1,side2,side3);
        if (triangle.checkTriangle()){
        System.out.println(triangle);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        }else {
            System.out.println(" đây không phải tam giác ");
        }
    }
}
