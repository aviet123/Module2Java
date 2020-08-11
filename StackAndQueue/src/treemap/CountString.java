package treemap;
import java.util.Scanner;
import java.util.TreeMap;
public class CountString {
    public static void countSentences(String sentence){
        TreeMap<String,Integer> map = new TreeMap<>();
        String[] array = sentence.split(" ");
        for( String string: array){
            int count = 0;
            for (String s : array) {
                if (string.equals(s)) {
                    count++;
                }
            }
            map.put(string,count);
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập ");
        String n = scanner.nextLine();
        String low = n.toLowerCase();
        countSentences(low);
    }
}
