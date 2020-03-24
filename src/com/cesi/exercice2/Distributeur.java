package com.cesi.exercice2;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Distributeur {

    private double price;
    private double money;
    private double difference;
    private int nbMonay = 0;
    private int nbDispoMonayInDistributeur = 5;
    private double[] possibilities = {2, 1, 0.5, 0.2, 0.1};

    public Distributeur(double price, double money){
        this.price = price;
        this.money = money;
    }

    public void renderMoney(){
        for(Double d : this.possibilities){
            System.out.print("Piece de " + d + " euros nombre: ");
            recursifDeOuf(this.difference, d);
        }
    }

    public String render(){
        this.calculDifference();
        return this.toString();
    }

    public void recursifDeOuf(double diff, double piece){
        if(piece > diff && this.nbDispoMonayInDistributeur > 0) {
            System.out.println(this.nbMonay);
            this.nbMonay = 0;
            this.nbDispoMonayInDistributeur = 5;
            return;
        }
        diff -= piece;
        this.difference = diff;
        this.nbMonay++;
        this.nbDispoMonayInDistributeur--;
        recursifDeOuf(diff,piece);
    }

    private void calculDifference(){
        double diff = this.money - this.price;
        this.difference =  Math.round( diff * 100 ) / 100.0;
    }

    public String toString(){
        return("Le prix est de : " + this.price
                + " la monaie insérée est " + this.money
                + " la différence est de " + this.difference
        );
    }
}
