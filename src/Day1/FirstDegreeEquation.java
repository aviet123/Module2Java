package Day1;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("a :");
        a = sc.nextDouble();
        System.out.print("b :");
        b = sc.nextDouble();
        System.out.print("c :");
        c = sc.nextDouble();

        if (a !=0){
            double answer = (c-b)/ a;
            System.out.println("Equation with x: "+ answer);
        }else{
            if (b == 0){
                System.out.println("The solution is al x!");
            }else {
                System.out.println("No solution");
            }
        }
    }
}
