package ArrayFunctionAndOOP;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập cột cần tính");
        int N = scanner.nextInt();


        int[][] matrix = new int[5][5];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        int totalcolumn = 0;
        for (int row = 0; row < matrix[0].length; row++) {
                totalcolumn += matrix[row][N];
            }
        System.out.printf("sum of column %d is %d ",N , totalcolumn);
    }
}
