package ArrayList;
import java.util.ArrayList;

public class BookStore {
	String name;
	ArrayList<Book> books= new ArrayList<>();
	
	public Book findBook(String title, String author) {
		for(Book b: books) {
			if(b.bookAuthor.equals(author) && b.bookTitle.equals(title)) {
				return b;
			}		
		}
		return null;
	}
	
	public void sell(String title, String Author, int copies) {
		Book b = findBook(title, Author);
		if(b==null) {
			System.out.println("Book not Found.");
		}
		else {
			if(b.numOfCopies<copies) {
				System.out.println("Not enough Books.");
			}
			else {
				b.numOfCopies-=copies;
			}
		}
		
	}
		public void order(String title, String Author, int copies) {
		Book b = findBook(title, Author);
		if(b==null) 
		  {
			books.add(new Book(title, Author, copies));
		  }
		else {
			b.numOfCopies+=copies;
	 	     }
	    }
		
	
		void display() {
			  for(Book i: books){
		            System.out.println(i);
			  }		
		}
}
