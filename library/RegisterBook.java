package library;

public class RegisterBook {
	
	public static void main(String[] args) {
		
		Author author = new Author();
		author.name = "Neil Gaiman";
		author.cpf = "123.456.789.00";
		author.email = "neil@gmail.com";
		
		Book book = new Book();
		book.name = "Coraline";
		book.description = "Livro 1";
		book.isbn = "878-55-66250-45-5";
		book.price = 79.90;
		
		book.author = author;
		
		book.detailsBook();
		
		Book book2 = new Book();
		book2.name = "Sandman";
		book2.description = "Livro 2";
		book2.isbn = "878-55-66250-45-7";
		book2.price = 87.00;
		
		book2.author = author;
		
		book2.detailsBook();
		
		
	}

}
