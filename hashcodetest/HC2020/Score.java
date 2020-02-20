package HC2020;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;

public class Score {

    public static int getScore(File ans){
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
        char[] books;
        for(int i = 0; i < numlibraries; i++){
            scan.nextLine();
            books = scan.nextLine().trim().toCharArray();
            for (char c : books) {
                String s = String.valueOf(c);
                scoredBooks.add(Integer.parseInt(s));
            }
        }
        return 0;
    }
}
