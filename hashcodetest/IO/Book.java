package IO;

public class Book implements Comparable<Book>  {
    public final int INDEX; 
    public final int VALUE; 
    
    public Book(int index, int value) {
        this.INDEX = index;
        this.VALUE = value; 
       
    }
    public int compareTo(Book b) {
    	return this.INDEX-b.INDEX;
    }
    
    public int hashCode() {
        return INDEX*347 + VALUE*647; 
    }
}
