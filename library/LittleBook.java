package library;

public class LittleBook extends Book {
	
	public LittleBook(Author author) {
		super(author);
	}
	
	@Override
	public boolean applyDiscount(double percentage) {
		return false;
	}
}
