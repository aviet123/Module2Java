package ArrayAndLoopLesson;

import java.util.Scanner;

public class ConvertCelsiusToF {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("menu. ");
            System.out.println("1. convert C to F");
            System.out.println("2. convert F to C");
            System.out.println("0. exit");
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println(" equivalent to F is " + celsiusToF(celsius));
                    break;
                case 2:
                    System.out.println("enter Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(" equivalent to C is: "+ fahrenheitToC(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choice! ");
            }

        }while (choice != 0);
    }
    public static double celsiusToF(double celsius){
        double fahrenheit = 32 + celsius * (9.0/5);
        return fahrenheit;
    }
    public static double fahrenheitToC (double fahrenheit){
        double celsius = (5.0/9) * (fahrenheit - 32);
        return celsius;
    }
}
