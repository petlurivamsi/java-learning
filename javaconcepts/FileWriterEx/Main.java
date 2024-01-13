package FileWriterEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter(new File("FileWriterEx","poem.txt"));
            writer.write("Roses are red \n Violets are blue \n booty booty booty booty \n Rockin everywhere");
            writer.append("\n(Bye bro)");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
