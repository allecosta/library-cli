package library;

public class RulesDiscount {
	
	public static void main(String[] args) {
		
		Book book = new Book();
		book.setPrice(79.80);
		
		System.out.println("Preço atual: " + book.getPrice());
		
		if (!book.applyDiscount(0.5)) {
			System.out.println("Não pode ser concedido desconto maior que 30%!");
		} else {
			System.out.println("Preço com desconto: " + book.getPrice());
		}
	}

}
