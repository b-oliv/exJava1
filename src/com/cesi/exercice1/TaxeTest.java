package com.cesi.exercice1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TaxeTest {

	@Test
	void Given_Salary120000_TaxeFromInt_ShouldBe_31200() {
		Taxe taxe = new Taxe(120000);
		assertEquals(taxe.getImpot(), 31200.00);
	}
	
	@Test
	void Given_Salary120000_TaxeFromDouble_ShouldBe_31200() {
		Taxe taxe = new Taxe(120000.00);
		assertEquals(taxe.getImpot(), 31200.00);
	}
	
	@Test
	void getPercentage_to_Salary120000_shouldBe_26Percentage() {
		Taxe taxe = new Taxe(120000);
		assertEquals(taxe.getPercentage(2), 26.00);
	}
	
	@Test
	void getPercentage_to_SalaryFirstStep_shouldBe_ZeroPercentage() {
		Taxe taxe = new Taxe(9999);
		assertEquals(taxe.getPercentage(0), 0.00);
	}

}
