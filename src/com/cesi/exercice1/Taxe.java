package com.cesi.exercice1;

import java.util.*;

public class Taxe {

    private double salary;
    private double nearest;
    private int IndexGridPercentage;
    private int percentage;
    private List<Double> gridSalaree = new ArrayList<>();
    private int[] gridPercentage = {0, 14, 26, 35, 50};

    public Taxe(int salary){
        this.salary = (double) salary;
        this.initGridSalary();
        this.run();
    }

    public Taxe(double salary){
        this.salary = salary;
        this.initGridSalary();
        this.run();
    }

    public void run(){
        this.nearest = this.nearest(this.salary);
        this.IndexGridPercentage = this.getIndexGridPercentage(this.nearest);
        this.percentage = this.getPercentage(this.IndexGridPercentage);
    }

    double getImpot(){
        return this.salary * this.percentage / 100;
    }

    private void initGridSalary(){
        this.gridSalaree.add(9999.00);
        this.gridSalaree.add(29999.00);
        this.gridSalaree.add(99999.00);
        this.gridSalaree.add(499999.00);
        this.gridSalaree.add(500000.00);
    }

    public int getPercentage(int indexPercentage){
        int index = 0;
        int percentage = 0;
        for (int v : this.gridPercentage)
        {
            if(index == indexPercentage){
                percentage = v;
                break;
            }
            index++;
        }
        return percentage;
    }

    public int getIndexGridPercentage(double nearest){
        int index = 0;
        for (double v : this.gridSalaree)
        {
            if(v == nearest){
                break;
            }
            index++;
        }
        return index;
    }
    
    public double nearest(double salary)
    {
        double min = Double.MAX_VALUE;
        double closest = salary;
        for (double v : this.gridSalaree)
        {
            final double diff = Math.abs(v - salary);

            if (diff < min)
            {
                min = diff;
                closest = v;
            }
        }
        return closest;
    }

    public String toString(){
        return ("Votre salaire de " + this.salary
                + " atteint un pourcentage d'imposition de " + this.percentage
                + " votre impot est de " + this.getImpot() );
    }
}