package teo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.*;

import IO.*; 

public class Solver {
    
    public static void main(String[] args) {
        Solver solver = new Solver();
        solver.solve(FileIO.getFile("in/4.txt"));
        System.out.println("Done");
        
        
    }
    
    public void solve(File file) {
        System.out.println("Starting");
        Inparser parser = new Inparser(file); 
        
        LinkedList<Lib> sortedLib = new LinkedList<>(); 
        
        for(Lib l: parser.libraries) {
            sortedLib.add(l); 
        }
        
        sortedLib.sort((l1,l2) -> calcVal(l1)-calcVal(l2));
        Lib next = null;
        LinkedList<Lib> built = new LinkedList<>(); 
        HashMap<Lib, ArrayList<Book>> ans = new HashMap<>(); 
        
        boolean canBuild = true; 
        int timeUntil = 0; 
        for(int days=0; days<parser.time; days++) {
            
            if(timeUntil==0) {
                canBuild= true; 
            }
            
            if(canBuild) {
                if(next != null) {
                    built.add(next); 
                    ans.put(next, new ArrayList<>()); 
                }
                next = sortedLib.removeLast(); 
                timeUntil = next.SIGNUP; 
                canBuild = false; 
            }
            
            for(Lib l: built) {
                int dayCount = l.BOOKSPERDAY; 
                for(int i =0; i<dayCount; i++) {
                    if(!l.Books.isEmpty()) {
                        ans.get(l).add(l.Books.get(0));
                        l.Books.remove(0); 
                    }
                }
            }
            timeUntil--; 
        }
        
        try {
            HC2020.OutCreator.createOutputFile(built, ans, "out4");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
    }
        
    public int calcVal(Lib lib){
        int score = 0;
        for (Book b : lib.Books) {
            score += b.VALUE;
        }
        return score;
    }
}
