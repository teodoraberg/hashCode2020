package pizza;

import IO.*;
import java.io.File;
import java.util.Scanner;

public class InOutTest {

    public static void main(String[] args){
        //File in1 = new File("./in/in1.txt");
        File in2 = FileIO.getFile("in/Test/in1.txt");
        Scanner scan;
        try{
            scan = new Scanner(in2);
            System.out.println(scan.next());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
