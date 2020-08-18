package excercise;

import java.io.*;

public class FileCopy {
    public static final String SOURCE_FILE="D:\\SourceFile.txt";
    public static final String COPYFILESOURCE_FILE="D:\\TargetFile.txt";
    public static void main(String[] args) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            File fileCopy = new File(COPYFILESOURCE_FILE);
            inStream = new FileInputStream(new File(SOURCE_FILE));
            outStream = new FileOutputStream(new File(COPYFILESOURCE_FILE));
            
            int length;
            while ((length = inStream.read()) > 0){
                outStream.write(length);
            }
            System.out.println("file is copied successfully");
            //đọc file

            BufferedReader reader = new BufferedReader(new FileReader(fileCopy));
            int count = 0;
            String line = "";
            while ((line=reader.readLine())!= null){
                count += line.length();
            }
            System.out.println(count);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
