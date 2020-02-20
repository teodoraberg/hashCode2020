package IO;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inparser {
    public int nbrBooks;
    public int nbrLibraries;
    public int time;

    public Book[] books; 
    public HashMap<Integer, ArrayList<Book>> libraries;
    public int[] booksAtLib; 
    public int[] signUpTime;
    public int[] booksPerDay;

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
        signUpTime = new int[nbrLibraries];
        booksPerDay = new int[nbrLibraries];
        booksAtLib = new int[nbrLibraries];
        
        String[] bookVals = scan.next().split(" "); 
                
        for(int i=0; i<nbrBooks; i++) {
            books[i] = new Book(i, strToInt(bookVals[i])); 
        }
        
        for(int i=0; i<nbrLibraries; i++) {
            
            
            }
        
        }
    private int strToInt(String str) {
        return Integer.valueOf(str); 
    }
}
