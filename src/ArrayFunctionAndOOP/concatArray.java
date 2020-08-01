package ArrayFunctionAndOOP;

import java.util.Scanner;

public class concatArray {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[4];
        int[] array3 = new int[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array1.length; i++) {
            System.out.print("enter element" + (i+1) +":");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print("enter element" + (i+1)+":");
            array2[i] = scanner.nextInt();
        }
        for (int j = 0; j <= array1.length-1; j++) {
            array3[j] = array1[j];
        }
        int x = array1.length;
        for (int k = 0; k <= array2.length-1 ; k++) {
            array3[x] = array2[k];
            x++;
        }
        for (int c:array3){
            System.out.println(c);
        }
    }
}
