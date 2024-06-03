package br.com.library.product;

import br.com.library.Author;

public class PhysicalBook extends Book implements Promotional {
	
	public PhysicalBook(Author author) {
		super(author);
	}
	
	public double getPrinting() {
		return this.getPrice() * 0.05;
	}
	
	public boolean applyDiscount(double percentage) {
		if (percentage > 0.3) {
			return false;
		}
		
		double discount = getPrice() * percentage;
		setPrice(getPrice() - discount);
		
		System.out.println("Aplicando desconto no livro fisico!");
		
		return true;
	}
}
