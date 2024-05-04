package library;

public class CalculatorStock {
	
	public static void main(String[] args) {
		
		double total = 0;
		
		for (double i = 0; i < 50; i++) {
			total += 49.80;
		}
		
		System.out.println("Estoque: " + total);
		
		if (total < 500) {
			System.out.println("Estoque atual baixo!");
		} else if (total >= 1500) {
			System.out.println("Estoque atual acima do permitido!");
		} else {
			System.out.println("Estoque atual dentro do esperado!");
		}
		
	}

}
