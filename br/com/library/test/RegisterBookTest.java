package br.com.library.test;

import br.com.library.Author;
import br.com.library.product.*;

public class RegisterBookTest {
	
	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("Neil Gaiman");
		author.setCpf("123.456.789.00");
		author.setEmail("neil@gmail.com");
		
		Book book = new PhysicalBook(author);
		book.setName("Coraline");
		book.setDescription("Livro 1");
		book.setIsbn("878-55-66250-45-5");
		book.setPrice(79.90);
		book.setAuthor(author);
		
		book.detailsBook();
		
		Book book2 = new PhysicalBook(author);
		book2.setName("Sandman");
		book2.setDescription("Livro 2");
		book2.setIsbn("878-55-66250-45-7");
		book2.setPrice(87.00);
		book2.setAuthor(author);
		
		book2.detailsBook();

		double totalPrice = book.getPrice() + book2.getPrice();

		System.out.println("\nValor total R$ " + totalPrice);
	}
}
