package br.com.library.test;

import br.com.library.Author;
import br.com.library.product.*;
import java.text.DecimalFormat;

public class RulesDiscountTest {
	
	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("Neil Gaiman");
		
		PhysicalBook book = new PhysicalBook(author);
		book.setPrice(25.80);

		DecimalFormat decimalFormat = new DecimalFormat();
		
		if (!book.applyDiscount(0.3)) {
			System.out.println("Desconto no livro não pode ser maior que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + decimalFormat.format(book.getPrice()));
		}
		
		Ebook ebook = new Ebook(author);
		ebook.setPrice(39.40);
		
		if (!ebook.applyDiscount(0.1)) {
			System.out.println("Desconto no ebook não pode ser maior que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + decimalFormat.format(ebook.getPrice()));
		}
	}

}
