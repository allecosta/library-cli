package library;

public class Book {
	
	String name, description, isbn;
	private double price;
	Author author;
	
	//public Book() {
		//System.out.println("Novo livro criado com sucesso!");
	//}
	
	void detailsBook() {
		System.out.println("\n\tDETALHES DO LIVRO:");
		System.out.println("Nome: " + name);
		System.out.println("Descrição: " + description);
		System.out.println("ISBN: " + isbn);
		System.out.println("Preço: " + price);
		
		if (this.existAthor()) {
			author.detailsAuthor();
		}
		
		System.out.println("---");
	}
	
	boolean existAthor() {
		return this.author != null;
	}
	
	void setPrice(double price) {
		this.price = price;
	}
	
	double getPrice() {
		return price;
	}
	
	public boolean applyDiscount(double percentage) {
		if (percentage > 0.3) {
			return false;
		}
		
		this.price -= this.price * percentage;
		
		return true;
	}
}
