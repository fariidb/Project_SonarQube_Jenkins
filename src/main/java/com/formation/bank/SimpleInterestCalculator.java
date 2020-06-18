package com.formation.bank;

public class SimpleInterestCalculator implements InterestCalculator {
	
	private double rate;
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double calculate(double amount, double year) {
		if (amount <0 || year <0) {
			throw new IllegalArgumentException(
						"Le montant et la duree doivent être positifs");
					
		}
		return amount * year * rate;
		
	}
	

}

