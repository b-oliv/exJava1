package com.cesi.exercice9;

public class Bissextile {
	
	private int year;
	
	public Bissextile(int year) {
		this.year = year;
	}
	
	public boolean isBissextile() {
		boolean bissextile = false;
		if( (this.year % 4) == 0 &&  (this.year % 100) != 0) {
			bissextile = true;
		}else if((this.year % 400) == 0) {
			bissextile = true;
		}
		return bissextile;
	}
	
	

}
