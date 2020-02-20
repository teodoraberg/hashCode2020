package IO;

import java.util.ArrayList;
import java.util.List;

public class Lib implements Comparable<Lib> {
    public final int INDEX; 
    public final int NBRBOOKS;
    public final ArrayList<Book> Books; 
    public final int SIGNUP; 
    public final int BOOKSPERDAY; 
    
    public Lib(int index, int nbrBooks, ArrayList<Book> books, int signUp, int booksPerDay) {
        this.INDEX = index;
        this.NBRBOOKS = nbrBooks; 
        this.Books = books; 
        this.SIGNUP = signUp; 
        this.BOOKSPERDAY = booksPerDay; 
    }
    public int compareTo(Lib a) {
    	return (this.BOOKSPERDAY/this.SIGNUP-a.BOOKSPERDAY/a.SIGNUP);
    }

}
