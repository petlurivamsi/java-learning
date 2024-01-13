package FileReaderEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("FileReaderEx\\art.txt");
            int data = file.read();
            while(data!=-1){
                System.out.print(data);
                data=file.read();
            }
            file.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
