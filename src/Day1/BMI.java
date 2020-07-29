package Day1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Enter your weight (in kilogram)");
        weight = sc.nextDouble();
        System.out.println("Enter your height (in meter)");
        height = sc.nextDouble();

        bmi = weight / Math.pow(height,2);

        System.out.printf("%-20s%s","bmi","interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s",bmi,"underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s",bmi,"Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s",bmi,"overweight");
        else
            System.out.printf("%-20.2f%s",bmi,"obese");

    }
}
