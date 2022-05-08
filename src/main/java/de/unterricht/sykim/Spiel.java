package de.unterricht.sykim;

public class Spiel {

    public static void simplesSpiel(Spieler s1, Spieler s2){
        int s1Value = s1.wuerfeln();
        int s2Value = s2.wuerfeln();

        if(s1Value > s2Value){
            s1.punktPlus();
            System.out.println("Spieler1 hat gewonnen!");
        } else if(s1Value == s2Value){

        } else {
            System.out.println("Spieler2 hat gewonnen!");
            s2.punktPlus();
        }
    }
}
