package com.cesi.exercice5;

public class Emprunt {

    private double totalEmprunt;
    private double interet;
    private double parAn;

    public Emprunt(double totalEmprunt, double  interet){
        this.totalEmprunt =totalEmprunt;
        this.interet = interet;
    }

    public String calculeAnne(){
        double sommeAndInteret = (this.totalEmprunt * this.interet) / 100;
        double byAnn = sommeAndInteret / 12;
        byAnn = Math.round(byAnn * 10) /10;
        return "" + byAnn;
    }

    public String toString(){
        return "Il faudra " + this.calculeAnne() + " Année pour rembourser le crédit";
    }


}
