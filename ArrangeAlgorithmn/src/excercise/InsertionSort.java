package excercise;

import java.util.Scanner;

public class InsertionSort {

    private static void enterArray(int []A, int n) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("A[ " + i + " ]: ");
            A[i] = scn.nextInt();
        }
    }

    private static void insertionSort(int []A, int n) {
        ApplyInsertSort.insertSort(A, n);
    }
    public static void main(String[] args) {
        int []A;
        int n = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("enter numbers: ");
        n = scn.nextInt();
        A = new int[n];
        enterArray(A, n);
        insertionSort(A, n);
    }
}
