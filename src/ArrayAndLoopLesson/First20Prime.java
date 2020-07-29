package ArrayAndLoopLesson;

import java.util.Scanner;

public class First20Prime {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        int N = 2;
        boolean check ;

        Scanner input = new Scanner(System.in);

        System.out.println("nhập số lượng");
        numbers = input.nextInt();

        while (count < numbers){
            if (isPrime(N)){
                count++;
                System.out.println(N+",");
            }
            N++;
        }
    }
    public static boolean isPrime(int N){
        if (N < 2){
             return false;
        }else {
            for (int i = 2; i < N ; i++) {
                if (N % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
