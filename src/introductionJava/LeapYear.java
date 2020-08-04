package introductionJava;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;

        System.out.println("Enter a year: ");
        year = sc.nextInt();
        boolean isLeapYear = true;

        boolean isDividedBy4 = year % 4 == 0;
        if (isDividedBy4){
            boolean isDividedBy100 = year % 100 == 0;
            if (isDividedBy100){
                boolean isDividedBy400 = year % 400 == 0;
                if (isDividedBy400){
                    isLeapYear = true;
                }
                else
                    isLeapYear = false;
            } else {
                isLeapYear = true;
            }
        }else {
            isLeapYear = false;
        }
        if (isLeapYear){
            System.out.printf("%d is the leap year", year);
        }else {
            System.out.printf("%d is not the leap year", year);
        }
    }
}
