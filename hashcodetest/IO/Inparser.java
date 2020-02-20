package IO;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Inparser {
    public int nbrBooks;
    public int nbrLibraries;
    public int time;

    public ArrayList<Book> books = new ArrayList<>();
    public HashMap<Integer, Book> indexToBook = new HashMap<>();
    public ArrayList<Lib> libraries = new ArrayList<>();

    public Inparser(File file) {
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (Exception e) {
            System.out.println("FEL");
            System.exit(1);
        }
        String[] firstLine = scan.nextLine().split(" ");
        nbrBooks = strToInt(firstLine[0]);
        nbrLibraries = strToInt(firstLine[1]);
        time = strToInt(firstLine[2]);

        String[] bookVals = scan.nextLine().split(" ");

        for (int i = 0; i < nbrBooks; i++) {
            Book tempBook = new Book(i, strToInt(bookVals[i]));
            books.add(tempBook);
            indexToBook.put(i, tempBook);
        }

        for (int i = 0; i < nbrLibraries; i++) {
            String[] frstLine = scan.nextLine().split(" ");
            String[] scndLine = scan.nextLine().split(" ");
            ArrayList<Book> bookAtLib = new ArrayList<>();
            for (int j = 0; j < strToInt(frstLine[0]); j++) {
                bookAtLib.add(books.get(strToInt(scndLine[j])));
            }

            libraries.add(new Lib(i, strToInt(frstLine[0]), bookAtLib, strToInt(frstLine[1]),
                    strToInt(frstLine[2])));

        }

    }

    private int strToInt(String str) {
        return Integer.valueOf(str);
    }

//    public static void main(String[] args) {
//        Inparser parser = new Inparser(FileIO.getFile("in/4.txt"));
//        System.out.println("Done!");
//        
//        System.out.println(parser.nbrBooks);
//        System.out.println(parser.nbrLibraries);
//        for(Book b: parser.books) {
//            System.out.println(b.VALUE);
//        }
//    }

}
