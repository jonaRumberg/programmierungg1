package Aufgaben.Aufgabenblatt8.Aufgabe32_33_34;

import Prog1Tools.IOTools;
import Aufgaben.Aufgabenblatt8.Aufgabe31.Rechnen;

public class Bruchrechnen {
    public static void main(String[] args) {
        Bruchzahl a = new Bruchzahl(0, 1);
        Bruchzahl b = new Bruchzahl(0, 1);
        einlesen(a);
        einlesen(b);
        System.out.println("Produkt von " + ausgeben(a) + " * " + ausgeben(b) + " = " + ausgeben(mul(a, b)));
        System.out.println("Quotient von " + ausgeben(a) + " / " + ausgeben(b) + " = " + ausgeben(div(a, b)));
        System.out.println("Summe von " + ausgeben(a) + " + " + ausgeben(b) + " = " + ausgeben(add(a, b)));
        System.out.println("Differenz von " + ausgeben(a) + " - " + ausgeben(b) + " = " + ausgeben(sub(a, b)));
    }

    public static void einlesen(Bruchzahl a) {
        a.zaeler = IOTools.readInt("Zaeler: ");
        int nen = 0;
        while (nen == 0) {
            nen = IOTools.readInt("Nenner: ");
        }
        a.nenner = nen;
    }

    public static String ausgeben(Bruchzahl a) {
        return (a.zaeler + "/" + a.nenner);
    }

    public static double wert(Bruchzahl a) {
        return (double) a.zaeler / a.nenner;
    }

    public static Bruchzahl kehrWert(Bruchzahl a) {
        Bruchzahl res = new Bruchzahl(a.nenner, a.zaeler);
        return res;
    }

    public static Bruchzahl neg(Bruchzahl a) {
        Bruchzahl res = new Bruchzahl(-a.zaeler, a.nenner);
        return res;
    }

    public static Bruchzahl kuerzen(Bruchzahl a) {
        int ggT = Rechnen.ggt(a.nenner, a.zaeler);
        a.nenner /= ggT;
        a.zaeler /= ggT;
        if (a.nenner < 0 && a.zaeler < 0) {
            a.nenner = -a.nenner;
            a.zaeler = -a.zaeler;
        }
        Bruchzahl res = new Bruchzahl(a.zaeler, a.nenner);
        return res;
    }

    public static Bruchzahl mul(Bruchzahl a, Bruchzahl b) {
        Bruchzahl res = new Bruchzahl(a.zaeler * b.zaeler, a.nenner * b.nenner);
        return kuerzen(res);
    }

    public static Bruchzahl div(Bruchzahl a, Bruchzahl b) {
        Bruchzahl res = mul(a, kehrWert(b));
        return res;
    }

    public static Bruchzahl add(Bruchzahl a, Bruchzahl b) {
        Bruchzahl res = new Bruchzahl(a.zaeler * b.nenner + b.zaeler * a.nenner, a.nenner * b.nenner);

        return kuerzen(res);
    }

    public static Bruchzahl sub(Bruchzahl a, Bruchzahl b) {
        Bruchzahl res = add(a, neg(b));
        return res;
    }
}
