package introductionJava;

import java.util.Scanner;

public class ConvertUSDtoVND {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);

        System.out.println("mời bạn nhập tiền muốn đổi");
        usd = sc.nextDouble();

        double convert = usd * vnd;
        System.out.println("giá trị VND là:" +convert);

    }
}
