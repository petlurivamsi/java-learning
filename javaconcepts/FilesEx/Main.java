package FilesEx;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("FilesEx\\secret_message.txt");
        if(file.exists()){
            System.out.println("The file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.delete());
        }
        else{
            System.out.println("The file doesnot exists");
        }
        
    }    
}
