package com.cesi.exercice4;

public class Interet {

    private double somme;
    private int year = 0;
    private double interet;

    public Interet(double somme, double interet){
        this.somme = somme;
        this.interet = interet;
    }

    public double calculInteret(){
        return this.somme += (this.somme * this.interet) / 100;
    }

    public void setSomme(double somme){
        this.somme = Math.round(somme * 100) / 100;
    }

    public void nextYear(){
        this.year++;
        this.setSomme(this.calculInteret());
    }

    public String toString(){
        return "L'année " + this.year + " tu auras " + this.somme + " euros";
    }

}
