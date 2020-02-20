package melker;


public class melkeralgoritm1 {

	public static void main(String[] args) {
		
		Inparser parser = new Inparser();
		ArrayList<Book>books = parser.books;
		ArrayList<Lib>libs= parser.libraries;
		Set <Book>bokset= new Hashset<Book>();
		ArrayList<Lib>outlibs = new ArrayList<Lib>();
		int days = parser.time;
		Map<lib,ArrayList<Book>>map = new HashMap<lib,ArrayList<Book>>();
		
		libs.sort();
		int index = 0;
		while(days>0) {
			Lib L = libs.get(index);
			outlibs.add(L);
			days=days-L.time;
			index++;
		}
		
		
		
		
		
	}

}
