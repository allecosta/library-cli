package library;

public class Book {
	
	String name, description, isbn;
	double price;
	Author author;
	
	void detailsBook() {
		String message = "\n\tDETALHES DO LIVRO:";
		System.out.println(message);
		System.out.println("Nome: " + name);
		System.out.println("Descrição: " + description);
		System.out.println("ISBN: " + isbn);
		System.out.println("Preço: " + price);
		System.out.println("---");
	}	
}
