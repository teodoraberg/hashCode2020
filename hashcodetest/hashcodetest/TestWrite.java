package hashcodetest;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import IO.*;  

public class TestWrite {
    public static void main(String[] args) throws IOException {
        File writeTo = null; 
        try {
            writeTo = IO.FileIO.getFile("out/out1.txt");
        }catch(Exception e) {
            System.out.println("LUL");
        }
        FileWriter writer = new FileWriter(writeTo); 
        
        writer.append("epic");
        writer.close(); 
        System.out.println("Done!");
    }
}
