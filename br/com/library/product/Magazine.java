package br.com.library.product;

import br.com.library.PublishCompany;

public class Magazine implements Product, Promotional {
	
	private String name, description;
	private double price;
	private PublishCompany publishCompany;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PublishCompany getPublishCompany() {
		return publishCompany;
	}

	public void setPublishCompany(PublishCompany publishCompany) {
		this.publishCompany = publishCompany;
	}

	@Override
	public boolean applyDiscount(double percentage) {
		if (percentage > 0.1) {
			return false;
		}
		
		double discount = getPrice() * percentage;
		setPrice(getPrice() - discount);
		
		return true;
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
}
