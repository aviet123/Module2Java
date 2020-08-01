package ArrayFunctionAndOOP;

import java.util.Scanner;

public class AddElementToArr {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 6, 7, 8, 6, 9, 0, 0, 0};
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập Element need to add: ");
        int X = scanner.nextInt();
        System.out.println("nhập vị trí index: ");
        int index = scanner.nextInt();

        if (index <=1 || index >= arr.length-1){
            System.out.println("không chèn được phần tử");
        }else {
            for (int i = arr.length-1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            for (int j = 0; j <arr.length ; j++) {
                arr[index] = X;
                System.out.println(arr[j]+"\n");
            }
        }
    }
}
