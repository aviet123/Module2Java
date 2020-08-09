public class FizzAndBuzz {

    public static String getFizzAndBuzz (int number){
        if (number % 5==0 && number% 3==0){
            return "FizzBuzz";
        } else if (number % 3== 0){
            return "Fizz";
        }else if (number % 5== 0){
            return "Buzz";
        }else
            return translateNumber(number);
    }
    public static String getNumberContain3 (int number){
        String num = number+"";
        boolean isContain3 = num.charAt(0) == '3' || num.charAt(1) == '3';
        boolean isContain5 = num.charAt(0) == '5' || num.charAt(1) == '5';
        if (isContain3 && isContain5){
            return "FizzBuzz";
        }else if (isContain3){
            return "Fizz";
        }else if (isContain5){
            return "Buzz";
        }else
            return translateNumber(number);
    }
    public static String translateNumber(int number){
        String num = "";
        String[] array = {"khong","mot","hai", "ba", "bon", "nam","sau", "bay", "tam", "chin", "muoi", "muoimot",
               "muoihai", "muoiba", "muoibon", "muoilam" ,"muoisau", "muoibay", "muoitam", "muoichin"};
        String[] array2 = {"ko","mười","hai muoi","ba muoi","bon muoi","nam muoi",
                "sau muoi","bay muoi","tam muoi","chin muoi"};

       if (number < 20){
            num = array[number];
       }else {
           num += array2[number / 10];
           if (number % 10 > 0){
               num += array2[number/10] + " " +array[number];
           }
       }
       return num;
    }
}
