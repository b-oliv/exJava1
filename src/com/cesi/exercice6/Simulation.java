package com.cesi.exercice6;

import java.util.Random;

public class Simulation {

    private int[] gates = {0,1,2};
    private int winGate = 0;
    private int playerSelectGate = 0;
    private int offSelectGate = 0;

    public Simulation(){}

    private int generateRandomGate(){
        Random rand = new Random();
        int nbRandom = rand.nextInt(3 - 0 + 1) + 0;
        return nbRandom;
    }

    public int runGameNoChange(){
        System.out.println("Start game with no change");
        int counter = 0;
        int win = 0;
        while(counter <= 10){
            this.winGate = this.generateRandomGate();
            this.playerSelectGate = this.generateRandomGate();
            System.out.println("Porte gagante: " + this.winGate + " choix user: " + this.playerSelectGate);
            if(this.winGate == this.playerSelectGate){
                win++;
            }
            counter++;
        }
        return win;
    }

    public int runGameWithChange(){
        System.out.println("Game WITH change gate");
        int counter = 0;
        int win = 0;
        while(counter <= 10){
            this.winGate = this.generateRandomGate();
            this.playerSelectGate = this.generateRandomGate();
            this.offSelectGate = this.getEmptyGate( this.winGate, this.playerSelectGate) ;
            this.playerSelectGate = this.getEmptyGate( this.winGate,this.offSelectGate);
            System.out.println("Porte gagante: " + this.winGate + " choix user: " + this.playerSelectGate);
            if(this.winGate == this.playerSelectGate){
                win++;
            }
            counter++;
        }
        return win;
    }

    public int getEmptyGate(int firstGate, int secondGate){
        int gate = 0;
        for(int i = 0; i < 2; i++){
            if(i != firstGate && i != secondGate){
                gate = i;
            }
        }
        return gate;
    }

}
