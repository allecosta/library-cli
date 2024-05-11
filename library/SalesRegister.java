package library;

public class SalesRegister {
	
	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("Clarisse Lispector");
		
		PhysicalBook physic = new PhysicalBook(author);
		physic.setName("A vida íntima de Laura");
		
		Ebook ebook = new Ebook(author);
		ebook.setName("A hora da Estrela");
	}
}
