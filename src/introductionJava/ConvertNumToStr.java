package introductionJava;

import java.util.Scanner;

public class ConvertNumToStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số cần đổi: ");
        int number = sc.nextInt();
        String typeChu = null;
        String typeChu1 = "";
        String hangchuc ="";

        if (number < 10) {
            switch (number) {
                case 1:
                    typeChu = "one";
                    break;
                case 2:
                    typeChu = "two";
                    break;
                case 3:
                    typeChu = "three";
                    break;
                case 4:
                    typeChu = "four";
                    break;
                case 5:
                    typeChu = "five";
                    break;
                case 6:
                    typeChu = "six";
                    break;
                case 7:
                    typeChu = "seven";
                    break;
                case 8:
                    typeChu = "eight";
                    break;
                case 9:
                    typeChu = "nine";
                    break;
                case 10:
                    typeChu = "ten";
                default:
                    System.out.println("out of ability");
            }
            System.out.printf("dạng chữ của %d là %s", number, typeChu);
        }
        if (number > 10) {
            switch (number) {
                case 11:
                    typeChu1 = "eleven";
                    break;
                case 12:
                    typeChu1 = "twelve";
                    break;
                case 13:
                    typeChu1 = "thirteen";
                    break;
                case 14:
                    typeChu1 = "fourteen";
                    break;
                case 15:
                    typeChu1 = "fifteen";
                    break;
                case 16:
                    typeChu1 = "sixteen";
                    break;
                case 17:
                    typeChu1 = "seventeen";
                    break;
                case 18:
                    typeChu1 = "eighteen";
                    break;
                case 19:
                    typeChu1 = "nineteen";
                    break;
                case 20:
                    typeChu1 = "twenty";
            }
            System.out.printf("dạng chữ của %d là %s", number, typeChu1);
        }
        if(number > 20){
            switch (hangchuc){

            }
        }

    }
}
