package library;

public class PhysicalBook extends Book {
	
	public PhysicalBook(Author author) {
		super(author);
	}
	
	public double getPrinting() {
		return this.getPrice() * 0.05;
	}	
}
