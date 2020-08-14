package practise;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
        public static void readTextFile(String filepath){
            try {
                File file =  new File(filepath);

                if (!file.exists()){
                    throw new FileNotFoundException();
                }

                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line = "";
                int sum = 0;
                while ((line=reader.readLine()) != null){
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                reader.close();
                System.out.println("sum of numbers in file is: " +sum);
            } catch (Exception e) {
                System.out.println("error!");
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your path: ");
        String path = scanner.nextLine();
        readTextFile(path);
    }
}
