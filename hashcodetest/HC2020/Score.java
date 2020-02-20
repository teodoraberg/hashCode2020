package HC2020;

import IO.Inparser;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class Score {

    public long getScore(File ans, Inparser inparser){
        HashSet<Integer> scoredBooks = new HashSet<>();

        Scanner scan;
        try{
            scan = new Scanner(ans);
        }catch (Exception e){
            throw new IllegalArgumentException("DÅLIG FIL SKICKAD TILL SCORE");
        }

        if(scan.hasNext() == false){
            System.out.println("TOM FIL TILL SCORE!");
            return 0;
        }

        int numlibraries = Integer.parseInt(scan.next());
        String books;
        for(int i = 0; i < numlibraries; i++){
            scan.nextLine();
            books = scan.nextLine().trim();
            books = books. replaceAll("\\s","");
            for (char c : books.toCharArray()) {
                String s = String.valueOf(c);
                scoredBooks.add(Integer.parseInt(s));
            }
        }

        long score = 0;
        for (Integer i : scoredBooks) {
            score += inparser.indexToBook.get(i).VALUE;
        }

        return score;
    }
}
