package ArrayList;

public class Book {
	public String bookTitle;
	public String bookAuthor;
	public int numOfCopies;
	
	public Book(String bookTitle, String bookAuthor, int numOfCopies) {
		this.bookTitle=bookTitle;
		this.bookAuthor=bookAuthor;
		this.numOfCopies= numOfCopies;
	}
	
	public void display() {
		System.out.println(this);
	}
	
	public String toString() {
		return " Title : "+bookTitle+" , Author : "+bookAuthor+" , Quantity : "+numOfCopies+"  " ;
	}

}
