package excersice;


import Practise.MyGenericStack;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayStack {

    public static void reverseInteger(){
        int[] arrayInteger = {1,2,3,4,5,6};
        Stack<Integer> stack = new Stack<>();
        for (int j : arrayInteger) {
            stack.push(j);
        }
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i <arrayInteger.length ; i++) {
            stack2.push(stack.pop());
        }
//            for (int x: stack2){
//                System.out.println("stack: "+x);
//            }
    }
    public static void reverseString(String sentences){
        Stack<Object> wStack = new Stack<>();
        Object[] words = sentences.split(" ");
        for (Object j : words) {
            wStack.push(j);
        }
        Stack<Object> wStack2 = new Stack<>();

        while (!wStack.isEmpty()){
            wStack2.push(wStack.pop());
        }
        System.out.println(wStack2.size());
        for (Object x: wStack2){
            System.out.print(x + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap");
        String n = scanner.nextLine();
        System.out.println("");
        reverseInteger();
        System.out.println("");
        reverseString(n);
    }
}
