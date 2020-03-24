package com.cesi;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.cesi.exercice1.Taxe;
import com.cesi.exercice10.FormatDateToRomanCalendar;
import com.cesi.exercice2.Distributeur;
import com.cesi.exercice4.Interet;
import com.cesi.exercice5.Emprunt;
import com.cesi.exercice6.Simulation;
import com.cesi.exercice7.Suite;
import com.cesi.exercice8.ExPI;
import com.cesi.exercice9.Bissextile;

public class Main {

    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex4();
        //ex5();
        //ex6();
        //ex7();
        //ex8();
    	//ex9();
    	ex10();
        //fizzBuzz();
    }

    public static void ex1(){
        Taxe taxe = new Taxe(120000);
        System.out.println(taxe.toString() );

        Taxe taxe1 = new Taxe(9000);
        System.out.println(taxe1.toString() );

        Taxe taxe2 = new Taxe(35000);
        System.out.println(taxe2.toString() );
    }

    public static void ex2(){
        Distributeur distrubuteur = new Distributeur(5.35, 8.0);
        System.out.println(distrubuteur.render());
        distrubuteur.renderMoney();
    }

    public static void ex4(){
        Interet interet = new Interet(100.00, 5.53);
        interet.nextYear();
        System.out.println(interet.toString());
        interet.nextYear();
        System.out.println(interet.toString());
        interet.nextYear();
        System.out.println(interet.toString());
        interet.nextYear();
        System.out.println(interet.toString());
    }

    public static void ex5(){
        Emprunt emprunt = new Emprunt(5000, 3.15);
        System.out.println(emprunt.toString());
    };

    public static void ex6(){
        Simulation simulation = new Simulation();
        System.out.println("Le joueur sans changement a gagné " + simulation.runGameNoChange() + " fois");
        System.out.println("Avec changement il a gagné " +simulation.runGameWithChange() + " fois");
    }

    public static void ex7(){
        Suite suite = new Suite(144);
        suite.run();
    }

    public static void ex8(){
        ExPI resPi = new ExPI();
        Double pi = resPi.getPiValue();
        System.out.println(pi);

    }
    
    public static void ex9(){
    	//Not Bissextile
    	Bissextile year1 = new Bissextile(1989);
    	Bissextile year2 = new Bissextile(2015);
    	//Bissextile
    	Bissextile year3 = new Bissextile(2016);
    	Bissextile year4 = new Bissextile(2020);
    	//print res
        System.out.println("year 1 " + year1.isBissextile());
        System.out.println("year 1 " + year2.isBissextile());
        System.out.println("2016 est bissextile: " + year3.isBissextile());
        System.out.println("2020 est bissextile: " + year4.isBissextile());
    }
    
    public static void ex10() {
    	Calendar date = new GregorianCalendar(2020,3,25);
    	System.out.println(date.getTime());
    	FormatDateToRomanCalendar formatDate = new FormatDateToRomanCalendar(date);
    	formatDate.toString();

    	Calendar date1 = new GregorianCalendar(1275,1,1);
    	System.out.println(date1.getTime());
    	FormatDateToRomanCalendar formatDate1 = new FormatDateToRomanCalendar(date1);
    	formatDate1.toString();
    	
    	Calendar date2 = new GregorianCalendar(3089,11,12);
    	System.out.println(date2.getTime());
    	FormatDateToRomanCalendar formatDate2 = new FormatDateToRomanCalendar(date2);
    	formatDate2.toString();
    }

    public static void fizzBuzz(){
        for(int i = 0; i < 100; i++){
            if(i%10 == 5){
                System.out.println(i + "fizz");
            }
            if(i%10== 7){
                System.out.println(i + "buzz");
            }
            if (i%10 != 7 && i%10 != 5) {
                System.out.println(i);
            }
        }
    }
}
