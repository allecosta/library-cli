package library;

public class Magazine implements Product {
	
	private String name, description;
	private double price;
	private PublishCompany publishCompany;
	
	public boolean applyDiscount(double percentage) {
		if (percentage > 0.1) {
			return false;
		}
		
		double discount = getPrice() * percentage;
		setPrice(getPrice() - discount);
		
		return true;
	}

}
