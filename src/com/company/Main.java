package com.company;

public class Main {

    public static void main(String[] args) {
        int feuchtigkeit = 10;
        int sekunden =gießDauer(feuchtigkeit);
        gießDauer(30);
        System.out.println("Kauf dir einen Kaktus!!weil deine Gießdauer " + sekunden +" Sekunden beträgt");

	// write your code here
    }

 static int gießDauer(int feuchtigkeit){
        int sekunden;

        if (feuchtigkeit < 20){
            sekunden = 5;
        } else if (feuchtigkeit >20 && feuchtigkeit < 40){
            sekunden = 3;
        } else if (feuchtigkeit >= 40 && feuchtigkeit <= 75){
            sekunden = 1;
        } else {
            sekunden =0;
        }
       return sekunden;
 }
}