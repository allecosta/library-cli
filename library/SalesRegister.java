package library;

public class SalesRegister {
	
	public static void main(String[] args) {
		
		Author author = new Author();
		author.setName("Clarisse Lispector");
		
		PhysicalBook physic = new PhysicalBook(author);
		physic.setName("A vida íntima de Laura");
		physic.setPrice(59.90);
		
		Ebook ebook = new Ebook(author);
		ebook.setName("A hora da Estrela");
		ebook.setPrice(30.00);
		
		Cart cart = new Cart();
		
		cart.addCompras(physic);
		cart.addCompras(ebook);
		
		System.out.println("Total: " + cart.getTotal());
	}
}
