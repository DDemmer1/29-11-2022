package de.demmer.dennis;

public class Item {
	
	
	private double price;

	
	public void setPrice(double price) {	
		if(price < 0) {
			System.out.println("Der Preis ist unter 0. Preis wird auf 0 gesetzt");
			this.price = 0;
		} else {
			this.price = price;
		}
	}
	
	
	public double getPrice() {
		
		return this.price;
	}
	
	
	
	
	
	
	

}
