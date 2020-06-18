package com.formation.test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.formation.bank.InterestCalculator;
import com.formation.bank.SimpleInterestCalculator;

public class SimpleInterestCalculatorJUnit4Tests {
	
	private InterestCalculator interestCalculator;
	
	@Before
	public void init() {
		interestCalculator = new SimpleInterestCalculator();
		interestCalculator.setRate(0.05); 
	}

	@Test
	public void testCalculate() {
		double interest = interestCalculator.calculate(1000, 2);
		assertEquals(interest, 1000.0,0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testIllegalCalculate() {
		interestCalculator.calculate(-10000, 2);
	}
}
