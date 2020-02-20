package IO;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inparser {
    public int nbrBooks;
    public int nbrLibraries;
    public int time;

    public ArrayList<Book> books; 
    public ArrayList<Lib> libraries;

    public Inparser(File file) {
        Scanner scan = null; 
        try {
        scan = new Scanner(file); 
        }catch(Exception e) {
            System.out.println("FEL");
            System.exit(1);
        }
        String[] firstLine = scan.next().split(" "); 
        nbrBooks = strToInt(firstLine[0]); 
        nbrLibraries = strToInt(firstLine[1]); 
        time = strToInt(firstLine[2]);
       
        
        String[] bookVals = scan.next().split(" "); 
                
        for(int i=0; i<nbrBooks; i++) {
            books.add(new Book(i, strToInt(bookVals[i])));  
        }
        
        for(int i=0; i<nbrLibraries; i++) {
            String[] frstLine = scan.next().split(" "); 
            String[] scndLine = scan.next().split(" "); 
            ArrayList<Book> bookAtLib = new ArrayList<>(); 
            for(int j=0; j<strToInt(frstLine[0]); j++){
                bookAtLib.add(books.get(strToInt(scndLine[i]))); 
            }
            
            libraries.add(new Lib(i, strToInt(frstLine[0]), bookAtLib, strToInt(frstLine[1]), strToInt(frstLine[2]))); 
            
            }
        
        }
    private int strToInt(String str) {
        return Integer.valueOf(str); 
    }
}
