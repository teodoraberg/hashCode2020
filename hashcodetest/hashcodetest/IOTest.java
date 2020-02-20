package hashcodetest;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import IO.*;  

public class IOTest {
    public static void main(String[] args) throws IOException {
        File writeTo = null; 
        try {
            writeTo = IO.FileIO.getFile("out/test/1.txt");
        }catch(Exception e) {
            System.out.println("LUL");
        }
        FileWriter writer = new FileWriter(writeTo); 
        
        writer.append('a'); 
        writer.close(); 
        System.out.println("Done!");
    }
}
