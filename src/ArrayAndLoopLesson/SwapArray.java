package ArrayAndLoopLesson;

import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter size: ");
            size = scanner.nextInt();
            if (size >20){
                System.out.println("size does not exceed 20");
            }
        }while (size < 20);

        array = new int[size];
        for (int i = 0; i <array.length ; i++) {
            System.out.print("enter element" + (i+1) +":");
            array[i] = scanner.nextInt();
        }

        System.out.printf("%-20s%s", "element in array", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
