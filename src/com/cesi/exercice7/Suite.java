package com.cesi.exercice7;

public class Suite {

    private double a;

    public Suite(double a){
        this.a = a;
    }

    public double calcul(){
        double r = 1.00;
        for(int i = 0; i<30;i++){
            r = (r + this.a/r) *0.5;
        }
        return r;
    }

    public void run(){
        System.out.println(this.calcul());
    }
}
