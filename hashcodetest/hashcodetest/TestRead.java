package hashcodetest;

import IO.*;
import java.io.File;
import java.util.Scanner;

public class TestRead {

    public static void main(String[] args){
        File in2 = FileIO.getFile("in/in1.txt");
        Scanner scan;
        try{
            scan = new Scanner(in2);
            System.out.println(scan.next());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
