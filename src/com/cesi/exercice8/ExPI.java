package com.cesi.exercice8;

public class ExPI {

    private double a = 1.0;
    private double b = 1.0 / Math.sqrt(2);
    private double t = 1.0/4.0;
    private double p = 1.0;

    public ExPI() {
    }

    public ExPI(ExPI old) {
        a = (old.a + old.b) / 2;
        b = Math.sqrt(old.a * old.b);
        t = old.t - old.p * Math.pow((old.a - a), 2.0);
        p = 2 * old.p;
    }

    public double getPiValueBasicEstimate() {
        return  Math.pow((a + b), 2.0) / (4.0 * t);
    }

    public double getPiValue(int nbLoops) {
    	ExPI estimator = new ExPI();
        for (int i = 0; i < nbLoops-1; i++) {
            estimator = new ExPI(estimator);
        }
        return estimator.getPiValueBasicEstimate();
    }

    public double getPiValue() {
        return getPiValue (100);
    }


}
