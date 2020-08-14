package productmanagement;

import java.io.*;
import java.util.Scanner;

public class DataController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    DataController(){

    }
    public void openFileToWriter(String filename){
        try {
            fileWriter = new FileWriter(filename,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
     void writeProductToFile(Product product, String filename){
        printWriter.println(product.getId()+"|"+product.getName()+"|"+product.getName()+"|"
                            +product.getBrandName()+"|"+product.getOtherInformation());
    }
     void closeAfterWrite(String filename){
        try{
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
     }
}
