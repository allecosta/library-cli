package library;

public class Ebook extends Book {
	
	private String waterMark;
	
	public Ebook(Author author) {
		super(author);
	}

	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	@Override
	public boolean applyDiscount(double percentage) {
		if (percentage > 0.15) {
			return false;
		}
		
		return super.applyDiscount(percentage);
	}	
}
