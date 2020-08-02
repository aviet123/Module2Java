package ArrayFunctionAndOOP;

import java.util.Scanner;

public class FindCharInString {
    public static void main(String[] args) {
        String N = "nguyen van lam";
        int count = 0;
        for (int i = 0; i < N.length() ; i++) {
            if ('m' == N.charAt(i)){
                    count++;
                }
        }
        System.out.println(count);

    }
}
