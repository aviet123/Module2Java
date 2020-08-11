package decimaltobiary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        do {
            Stack<Integer> stack = new Stack<>();
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap số: ");
            int number = scanner.nextInt();
            while (number >= 2) {
                stack.push(number % 2);
                number = number / 2;
                if (number < 2) {
                    stack.push(1);
                }
            }
            Stack<Integer> stack2 = new Stack<>();
            while (!stack.isEmpty()) {
                stack2.push(stack.pop());
            }
            System.out.println(stack2);
        }while (true);
    }
}
