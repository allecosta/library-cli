package br.com.library.product;

import br.com.library.Author;

public abstract class Book implements Product {
	
	private String name, description, isbn;
	private double price;
	private Author author;
	//private boolean printed;
	
	public Book(Author author) {
		if (author == null) {
			throw new RuntimeException("Todo livro existe um autor. Este campo não poder ser nulo!");
		}

		this.author = author;
		this.isbn = "000-00-00000-00-0";
		//this.printed = true;
	}
	@Override
	public int compareTo(Product another) {
		if (this.getPrice() < another.getPrice()) {
			return -1;
		}

		if (this.getPrice() > another.getPrice()) {
			return 1;
		}

		return 0;
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

	public void detailsBook() {
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
}
