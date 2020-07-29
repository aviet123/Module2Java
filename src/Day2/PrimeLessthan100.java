package Day2;

import java.util.Scanner;

public class PrimeLessthan100 {
    public static void main(String[] args) {
        int N = 2;

        while (N < 100){
            if (isPrime(N)){
                System.out.println(N);
            }
            N++;
        }
    }
    public static boolean isPrime (int N){
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
