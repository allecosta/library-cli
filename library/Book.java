package library;

public abstract class Book {
	
	private String name, description, isbn;
	private double price;
	private Author author;
	private boolean printed;
	
	public Book(Author author) {
		this.author = author;
		this.isbn = "000-00-00000-00-0";
		this.printed = true;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

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
	
	public boolean applyDiscount(double percentage) {
		if (percentage > 0.3) {
			return false;
		} 
		
		System.out.println("Aplicando desconto Livro!");
		this.price -= this.price * percentage;
		
		return false;
	}
}
