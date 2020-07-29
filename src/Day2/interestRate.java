package Day2;

import java.util.Scanner;

public class interestRate {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interest_rate ;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of money");
        money = input.nextDouble();

        System.out.println("Enter numbers of month");
        month = input.nextInt();

        System.out.println("Enter numbers of interest rate");
        interest_rate = input.nextDouble();

        double total_interest = 0;
        for (int i = 1; i <= month; i++) {
            total_interest += money * (interest_rate/100)/12 * month;

        }
        System.out.println("total interest is " + total_interest);
    }
}
