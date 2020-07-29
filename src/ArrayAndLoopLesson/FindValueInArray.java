package ArrayAndLoopLesson;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"văn", "lâm thồn", "dũng", "tùng", "hưng", "tuấn", "nghĩa", "nghĩa vũ", "dương", "minh"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a name's student: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)){
                System.out.println("student name: "+input_name+" is in position: "+(i+1)+" in the list");
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println( input_name +" is not in the list of rick kids");
        }
    }
}
