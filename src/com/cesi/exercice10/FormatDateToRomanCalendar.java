package com.cesi.exercice10;
import java.time.YearMonth;
import java.util.Calendar;

public class FormatDateToRomanCalendar {

	private Calendar date;
	private String[] allRomanMonth = { "Janus", "La purification", "Mars", "April", "Maia", "Junon", "Jules", "Auguste",
			"7eme mois", "8eme mois", "9eme mois", "10eme mois" };
	private String romanMonth;
	private TYPEMONTH typeMonth;
	private String romanDay;

	public FormatDateToRomanCalendar(Calendar date) {
		this.date = date;
		this.romanMonth = allRomanMonth[date.get(Calendar.MONTH)];
		this.caveMonthOrFullMonth();
	}

	private void caveMonthOrFullMonth() {
		String s = this.romanMonth;
		this.typeMonth =  (s.contains("Mars") || s.contains("Maia") || s.contains("Jules") || s.contains("8eme mois") ) ? TYPEMONTH.PLEIN : TYPEMONTH.CAVE;
	}
	
	private void defineDayMonth() {
		YearMonth yearMonthObject = YearMonth.of(date.get(Calendar.YEAR),date.get(Calendar.MONTH));
		int daysInMonth = yearMonthObject.lengthOfMonth(); 
		
		int day = date.get(Calendar.DAY_OF_MONTH);
		int dayNones = (typeMonth.equals(TYPEMONTH.PLEIN)) ?  7 : 5 ;
		int dayides = (typeMonth.equals(TYPEMONTH.PLEIN)) ?  15 : 13 ;
		
		if(day == 1) {
			romanDay = " calendes de ";
		}else if(day > 1  && day < (dayNones-1)) {
			romanDay = dayNones - day + " jours avant les nones de ";
		}else if(day == (dayNones-1) ) {
			romanDay = " veille des nones de ";
		}else if(day == dayNones ) {
			romanDay = " nones de ";
		}else if(day > dayNones && day < dayides -1 ) {
			romanDay =  dayides - day + " ides de ";
		}else if(day == (dayides - 1) ) {
			romanDay =  " veille ides de ";
		}else if(day == dayides){
			romanDay =  " ides de ";
		}else {
			romanDay =  daysInMonth - day + " calendes de ";
			this.romanMonth = allRomanMonth[date.get(Calendar.MONTH) + 1];
			this.caveMonthOrFullMonth();
		}
	}
	
	public String toString() {
		this.defineDayMonth();
		String str =  romanDay + " "
				+ romanMonth + " (" + typeMonth + ") "
				+ (date.get(Calendar.YEAR) + 754) + " ans après la fondation de la ville";
		System.err.println(str);
		return str;
	}

}
