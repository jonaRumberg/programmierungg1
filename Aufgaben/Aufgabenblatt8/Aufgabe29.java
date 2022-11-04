package Aufgaben.Aufgabenblatt8;

import Prog1Tools.IOTools;

/**
 * Für n einzulesende Werte deren Mittelwert und Varianz berechnen
 * 
 * 
 */

public class Aufgabe29 {
    public static void main(String[] args) {
        int n = IOTools.readInt("Anzahl der Werte: "); // n einlesen
        while (n > 0) {
            double[] x = new double[n]; // Feld erzeugen
            readWerte(x); // Werte einlesen
            System.out.println("Die Varianz ist " + varianz(x)); // Varianz berechnen
            n = IOTools.readInt("Anzahl der Werte: "); // n neu einlesen
        }
        // einlesen
        // berechnen
        // ausgeben
    }

    /**Ließt für das Feld x Werte ein
     * ACHTUNG! Nicht funktional
     * @param x
     */
    public static void readWerte(double[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = IOTools.readDouble("Element " + i + " des Feldes: ");
        }
    }

    /** Berechnet die Mittelwerte des eingegebenen Feldes
     * @param x
     * @return Mittelwert der Werte in x
     */
    public static double mittelWert(double[] x) {
        double res = 0;
        for (int i = 0; i < x.length; i++) {
            res += x[i];
        }
        res /= x.length;
        return res;
    }

    /** Berechnet die Varianz des eingegebenen Feldes
     * @param x
     * @return
     */
    private static double varianz(double[] x) {
        double mit = mittelWert(x);
        double res = 0;
        for (int i = 0; i < x.length; i++) {
            res += Math.pow(x[i] - mit, 2);
        }
        res/=x.length;
        return res;
    }
}
