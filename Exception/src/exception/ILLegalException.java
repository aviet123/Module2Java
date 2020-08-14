package exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ILLegalException {
    public static void checkExceptionTriangle(int a, int b, int c) throws ExceptionIllegal {
            if (a <= 0 || b <= 0 || c <= 0) {
            throw new ExceptionIllegal("không phải tam giác");
            }else if (a + b < c || a + c < b || b + c < a) {
                throw new ExceptionIllegal("sai con mẹ nó r");
            }
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhập canh a: ");
            int a = scanner.nextInt();
            System.out.println("nhập cạnh b: ");
            int b = scanner.nextInt();
            System.out.println("nhập cạnh c: ");
            int c = scanner.nextInt();
            checkExceptionTriangle(a,b,c);
        }catch (Exception e){
            System.out.println("Exception: "+e);
        }
    }
}