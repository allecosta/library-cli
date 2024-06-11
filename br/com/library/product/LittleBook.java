package br.com.library.product;

import br.com.library.Author;

public class LittleBook extends Book implements Promotional {
	
	public LittleBook(Author author) {
		super(author);
	}

	@Override
	public boolean applyDiscount(double percentage) {
		if (percentage > 0.15) {
			return false;
		}

		double discount = getPrice() * percentage;
		setPrice(getPrice() - discount);

		System.out.println("Aplicando desconto no Mini-Livro!");

		return true;
	}
}
