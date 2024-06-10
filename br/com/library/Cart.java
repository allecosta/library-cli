package br.com.library;

import br.com.library.product.Product;

import java.util.ArrayList;

public class Cart {
	
	private double total;
	private ArrayList<Product> products;

	public Cart(Product[] products) {
		this.products = new ArrayList<Product>();
	}

	public void addCompras(Product product) {
		this.products.add(product);
	}

	public void remove(int position) {
		this.products.remove(position);
	}
	
	public double getTotal() {
		return total;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}
}
