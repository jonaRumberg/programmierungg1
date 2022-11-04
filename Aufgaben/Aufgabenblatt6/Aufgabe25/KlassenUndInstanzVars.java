package Aufgaben.Aufgabenblatt6.Aufgabe25;

public class KlassenUndInstanzVars {
    public static void main(String[] args) {
        MixTyp f, g;
        f = new MixTyp();
        g = new MixTyp();
        System.out.println("f.s = " + MixTyp.s);
        System.out.println("f.i = " + f.i);
        System.out.println("g.s = " + MixTyp.s);
        System.out.println("g.i = " + g.i);
        MixTyp.s = 200;
        f.i = 20;
        System.out.println("f.s = " + MixTyp.s);
        System.out.println("f.i = " + f.i);
        System.out.println("g.s = " + MixTyp.s);
        System.out.println("g.i = " + g.i);
        MixTyp.s = 300;
        g.i = 30;
        System.out.println("f.s = " + MixTyp.s);
        System.out.println("f.i = " + f.i);
        System.out.println("g.s = " + MixTyp.s);
        System.out.println("g.i = " + g.i);
        MixTyp.s = 400;
        System.out.println("f.s = " + MixTyp.s);
        System.out.println("f.i = " + f.i);
        System.out.println("g.s = " + MixTyp.s);
        System.out.println("g.i = " + g.i);
    }
}
// Erkläutern sie den Unterschied zwischen Instanz und Klassenvariablen
// -> Klassenvariablen sind statische Variablen, die in der Klasse deklariert werden und für alle Objekte der Klasse gültig sind
// -> Wenn Klassenvariablen sich ändern, ändern sich alle Objekte der Klasse
// -> Klassenvariablen werden mit Klassenname.klassenvariable angesprochen
// -> Instanzvariablen sind Variablen, die in der Klasse deklariert werden und nur für das jeweilige Objekt gültig sind


// Wäre eine Anweisung der Form MixTyp.i = 40; zulässig?
// -> Nein, da i eine Instanzvariable ist und nicht über die Klasse angesprochen werden kann