package HC2020;

import IO.Book;
import IO.Lib;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class OutCreator{

    public static File createOutputFile(LinkedList<Lib> libraries, HashMap<Lib, ArrayList<Book>> ans, String fileName) throws IOException {
        File out = null;

        try {
            out = IO.FileIO.getFile("out/" + fileName + ".txt");

        }catch(Exception e) {
            e.printStackTrace();
        }
        FileWriter writer = new FileWriter(out);

        writer.write(String.valueOf(libraries.size())); //Skriv antal bibliotek
        writer.write("\n");
        for (Lib lib : libraries) {
            //Skriv bibliotekets ID och antal böcker den ska scanna på samma rad
            writer.write(String.valueOf(lib.INDEX));
            writer.write(" " + ans.get(lib).size() + " \n");
            //Ny rad med bok IDs. Loopa igenom alla böcker och printa deras id.
            for (Book b : ans.get(lib)) {
                writer.write(b.INDEX + " ");
            }
            writer.write("\n");
        }

        writer.close();
        return out;
    }

}
