package abc;

public class BookStore {
	Book[] books;
	int totalBooks;
	int currentNumOfBooks;
	
	public BookStore() {
		totalBooks = 10;
		currentNumOfBooks = 0;
		books = new Book[10];
	}	
	public void sell(String bookTitle, String author, int noOfCopies) {
		int point=0;
		for(int i=0; i<currentNumOfBooks; i++) {
			if(books[i].bookTitle.equals(bookTitle)) {
				if(books[i].bookAuthor.equals(author)) {					
				point = 1;
				if(books[i].numOfCopies >= noOfCopies) {
					books[i].numOfCopies=books[i].numOfCopies - noOfCopies;
					System.out.println("Done, Available Copies : "+books[i].numOfCopies);
				}			
				else {
					System.out.println("Not Enough books. ");
				}	
				}
			}
		}
		
		if(point == 0) {
			System.out.println("Sorry. Book not Found. ");
		}
	}	
	public void order(String bookTitle, String author, int noOfCopies) {
		int point=0;
		for(int i=0; i<currentNumOfBooks; i++) {
			if(books[i].bookTitle.equals(bookTitle)) {
			
				if(books[i].bookAuthor.equals(author)) {
					point = 1;
					books[i].numOfCopies+=noOfCopies;
				}
					
				}		
		}	
		
		if(point==0) {

            if(currentNumOfBooks<totalBooks){
                books[currentNumOfBooks] = new Book(bookTitle, author,noOfCopies);
                currentNumOfBooks++ ;
            }
		}
	}
	
	void display() {
		  for(int i=0; i< currentNumOfBooks;i++){
	            books[i].display();
		  }		
	}
}
