package br.com.library.test;

import br.com.library.Author;
import br.com.library.product.*;

public class RulesDiscountTest {
	
	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("Neil Gaiman");
		
		Book book = new LittleBook(author);
		book.setPrice(25.80);
		
		if (!book.applyDiscount(0.3)) {
			System.out.println("Desconto no livro não pode ser maior que 30%");
		} else {
			System.out.println("Valor do livro com desconto: " + book.getPrice());
		}
		
		Ebook ebook = new Ebook(author);
		ebook.setPrice(39.40);
		
		if (!ebook.applyDiscount(0.15)) {
			System.out.println("Desconto no ebook não pode ser maior que 15%");
		} else {
			System.out.println("Valor do ebook com desconto: " + ebook.getPrice());
		}
	}

}
