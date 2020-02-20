package IO;

import java.io.File;
import java.util.Scanner;

public class FileIO {

    private static final String OS = System.getProperty("os.name").toLowerCase();

    public static File readFile(String relPath) {
        String path = "";

        if(isMac()){
            path = "./" + relPath;
        }else if(isLin()){
            path = "../" + relPath;
        }else if(isWin()){
            System.out.println("WHY USE THIS OS BRO, CLASSIC MELKER, brainshake?");
            StringBuilder sb = new StringBuilder();
            for (char c : relPath.toCharArray()) {
                if(c != 47){
                    sb.append(c);
                }else {
                    sb.append("\\");
                }
            }
            path = "..\\" + relPath;
        }else{
            throw new IllegalArgumentException("BAD OS");
        }

        return new File(path);
    }


    private static  boolean isMac(){
        return OS.startsWith("mac");
    }

    private static  boolean isWin(){
        return OS.startsWith("win");
    }
    private static  boolean isLin(){
        return OS.startsWith("lin");
    }



}
