package excercise;

import java.util.Scanner;

public class ApplyInsertSort {
    private static void enterArray(int []A, int n) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("A[ " + i + " ]: ");
            A[i] = scn.nextInt();
        }
    }
    public static void showArray(int []A, int n){
        for (int i = 0; i < n ; i++) {
            System.out.println("index: "+i+"= "+A[i]);
        }

    }
    private static void insertionSort(int []A, int n) {
        insertSort(A, n);
    }

    static void insertSort(int[] A, int n) {
        for(int i=1; i<n; i++) {
            int x = A[i];
            int y = i;
            while( y > 0 && A[ y - 1 ] > x ) {
                System.out.println("swap "+A[y]+" and "+A[y-1]);
                A[y]=A[y-1];
                y--;
            }
            A[y] = x;
        }
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
        System.out.println("array after using InsertionSort");
        showArray(A,n);
    }
}
