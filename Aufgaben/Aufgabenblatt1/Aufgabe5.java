package Aufgaben.Aufgabenblatt1;

import Prog1Tools.IOTools;

public class Aufgabe5 {
    public static void main(String[] args) {
        double laenge = IOTools.readDouble("Laenge: ");
        double hoehe = IOTools.readDouble("Hoehe: ");
 
        double diagonaleBecher = Math.sqrt(laenge*laenge+hoehe*hoehe);
        System.out.println("Die Diagnoale des Bechers ist: " + diagonaleBecher);

        double durchmesserBoden = laenge / Math.PI;
        System.out.println("Die Diagnoale des Bechers ist: " + durchmesserBoden);

        double flaecheDosenboden = Math.PI * Math.pow(durchmesserBoden/2, 2);
        System.out.println("Die Flaeche des Dosenbodens ist: " + flaecheDosenboden);

        double mantel = laenge*hoehe;
        System.out.println("Die Mantelflaeche betraegt: " + mantel);

        double gesamt = 2*flaecheDosenboden+ mantel;
        System.out.println("Die Gesamtflaeche der Dose ist: " + gesamt);

        double volumen = hoehe*flaecheDosenboden;
        System.out.println("Das Volumen des Dosenbodens betraegt: " + volumen);

   }
}
