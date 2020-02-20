package HC2020;

import IO.Book;
import IO.FileIO;
import IO.Inparser;
import IO.Lib;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestOutCreator {

    public static void main(String[] args){
        File testFile = FileIO.getFile("in/e_so_many_books.txt");
        Inparser ip = new Inparser(testFile);

        Lib lib1 = new Lib(1, 3, new ArrayList<Book>(), 0, 0);
        Lib lib2 = new Lib(0, 5, new ArrayList<Book>(), 0, 0);
        List<Lib> libs = new ArrayList<>();
        libs.add(lib1);
        libs.add(lib2);
        HashMap<Lib, List<Book>> libBookMap = new HashMap<>();
        ArrayList<Book> books1 = new ArrayList<>();
        ArrayList<Book> books2 = new ArrayList<>();

        books1.add(new Book(5, 0));
        books1.add(new Book(2, 0));
        books1.add(new Book(3, 0));
        books2.add(new Book(0, 0));
        books2.add(new Book(1, 0));
        books2.add(new Book(2, 0));
        books2.add(new Book(3, 0));
        books2.add(new Book(4, 0));

        libBookMap.put(lib1, books1);
        libBookMap.put(lib2, books2);

        try{
            OutCreator.createOutputFile(libs, libBookMap, "testout");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
