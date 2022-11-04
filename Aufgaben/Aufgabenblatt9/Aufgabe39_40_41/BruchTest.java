package Aufgaben.Aufgabenblatt9.Aufgabe39_40_41;

public class BruchTest {
    public static void main(String[] args) {
        Bruch a = new Bruch();
        Bruch b = new Bruch();
        a.read();
        b.read();

        //multiplizieren
        Bruch c = a.mul(b);
        System.out.println("Multiplikation: " + c.toString());

        //dividieren
        Bruch d = a.div(b);
        System.out.println("Division: " + d.toString());

        //addieren
        Bruch e = a.add(b);
        System.out.println("Addition: " + e.toString());

        //subtrahieren
        Bruch f = a.sub(b);
        System.out.println("Subtraktion: " + f.toString());

        //double wert
        double g = a.wert();
        System.out.println("Double Wert: " + g);

        //Kehrwert
        Bruch h = a.kehrWert();
        System.out.println("Kehrwert: " + h.toString());

        //neg
        Bruch i = a.neg();
        System.out.println("Neg: " + i.toString());

        //gekuerzt
        Bruch j = a.kuerze();
        System.out.println("Gekuerzt: " + j.toString());

    }
}
