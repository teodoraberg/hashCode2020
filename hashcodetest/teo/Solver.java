package teo;

import java.io.File;
import java.util.ArrayList;

import IO.*; 

public class Solver {

    
    public void Solve(File file) {
        Inparser parser = new Inparser(file); 
        
        ArrayList<Book> sortedLib = new ArrayList<>(); 
        
        
    }
        
    public int calcVal(Lib lib){
        int score = 0;
        for (Book b : lib.Books) {
            score += b.VALUE;
        }
        return score;
    }
}
