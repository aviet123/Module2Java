package ptbac2;

import java.util.Scanner;

public class Enterdata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a: ");
        double a = scanner.nextInt();
        System.out.println("enter b: ");
        double b = scanner.nextInt();
        System.out.println("enter c: ");
        double c = scanner.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        System.out.println("a is: "+ quadraticEquation.getA());
        System.out.println("b is: "+ quadraticEquation.getB());
        System.out.println("c is: "+ quadraticEquation.getC());
        System.out.println("delta is: "+ quadraticEquation.getDiscriminant());
        System.out.println("root1 is: "+quadraticEquation.getRoot1());
        System.out.println("root2 is: "+quadraticEquation.getRoot2());
    }
}
