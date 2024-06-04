package br.com.library;

import br.com.library.product.Product;

public class Cart {
	
	private double total;
	private Product[] product = new Product[10];
	private int cont = 0;
	
	public void addCompras(Product product) {
		System.out.println("Adicionando: " + product);
		
		this.product[cont] = product;
		cont++;
		
		this.total += product.getPrice();
	}
	
	public double getTotal() {
		return total;
	}
}
