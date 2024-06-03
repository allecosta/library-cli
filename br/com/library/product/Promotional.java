package br.com.library.product;

@FunctionalInterface
public interface Promotional {
	
	boolean applyDiscount(double percentage);
	
	default boolean applyDiscount10Percentage(double percentage) {
		return applyDiscount(0.1);
	}
}
