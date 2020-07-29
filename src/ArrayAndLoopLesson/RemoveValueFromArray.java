package ArrayAndLoopLesson;

import java.util.Scanner;

public class RemoveValueFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 6, 7, 8, 6, 9, 0, 0, 0};
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value needing to remove: ");
        N = scanner.nextInt();

        for (int j = findIndex(arr,N); j <arr.length-1 ; j++) {
            arr[j] = arr[j+1];
        }
        for (int x: arr){
            System.out.println(x);
        }
    }
    public static int findIndex (int [] array, int n){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n){
                index = i;
                break;
            }
        }
        return index;
    }
}
