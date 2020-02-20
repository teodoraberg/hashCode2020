package melker;
import java.io.IOException;
import java.util.*;
import IO.*;

public class melkeralg2 {

	public static void main(String[] args) {

		Inparser parser = new Inparser(FileIO.getFile("in/in4.txt"));
		ArrayList<Book>books = parser.books;
		ArrayList<Lib>libs= parser.libraries;
		Set <Book>bokset= new HashSet<Book>();
		List<Lib>outlibs = new ArrayList<Lib>();
		int days = parser.time;
		HashMap<Lib,List<Book>>map = new HashMap<Lib,List<Book>>();

		Collections.sort(libs);
		int index = 0;
		while(days>0) {
			Lib L = libs.get(index);
			outlibs.add(L);
			days=days-L.SIGNUP;
			index++;
		}
		for(Lib L:outlibs) {
			map.put(L,L.Books);
		}
		try {
			HC2020.OutCreator.createOutputFile(outlibs, map, "melkeralg2");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}

}
