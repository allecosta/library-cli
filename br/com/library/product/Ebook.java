package br.com.library.product;

import br.com.library.Author;

public class Ebook extends Book implements Promotional {
	
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
		if (percentage > 0.1) {
			return false;
		}
		
		double discount = getPrice() * percentage;
		setPrice(getPrice() - discount);
		
		System.out.println("Aplicando desconto no Ebook!");
		
		return true;
	}	
}
