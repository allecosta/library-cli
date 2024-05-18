package library;

public class Cart {
	
	private double total;
	
	public void addCompras(Book book) {
		System.out.println("Adicionando: " + book);
		
		book.applyDiscount(0.5);
		total += book.getPrice();
	}
	
	public double getTotal() {
		return total;
	}
}
