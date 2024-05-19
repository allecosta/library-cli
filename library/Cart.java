package library;

public class Cart {
	
	private double total;
	
	public void addCompras(Product product) {
		System.out.println("Adicionando: " + product);
		
		total += product.getPrice();
	}
	
	public double getTotal() {
		return total;
	}
}
