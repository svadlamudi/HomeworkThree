// Name: Sai Kiran Vadlamudi		Username: svadlamudi		Section: B01
// Name: Marilda Bozdo				Username: mbozdo			Section: B06

public class Book implements ISame<Book>{

	// Book Object Fields
	String title;
	String author;
	int isbn;
	
	// Book Object COnstructor
	public Book(String title, String author, int isbn){
		this.title = title;
		this.author =author;
		this.isbn = isbn;
	}
	
	// Returns true if the author, title, and isbn of this book is the same as the given book
	public boolean same(Book t) {
		return this.title.equals(t.title)    &&
				this.author.equals(t.author) &&
				this.isbn == t.isbn;
	}

	// Returns true if the isbn of this book is less than the given book
	public boolean lessThan(Book t) {
		return this.isbn < t.isbn;
	}

}
