package ArrayAndLoopLesson;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a wanted size: ");
            size = scanner.nextInt();
            if (size >20){
                System.out.println("size should not exceed 20");
            }
        }while (size < 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("enter element "+(i+1)+" :");
            array[i]= scanner.nextInt();
        }
        System.out.print("property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+"\n");
        }
        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max){
                max = array[j];
                index = j;
            }
        }
        System.out.println("the largest property in the array is "+max+" at index "+index);
    }
}
