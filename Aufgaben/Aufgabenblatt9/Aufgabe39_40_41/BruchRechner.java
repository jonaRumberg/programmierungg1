package Aufgaben.Aufgabenblatt9.Aufgabe39_40_41;

import Prog1Tools.IOTools;

public class BruchRechner {
    public static void main(String[] args) {
        boolean programRunning = true;
        Bruch a = new Bruch();

        int c = 4;
        Bruch b = new Bruch();
        while (programRunning) {
            // build menu
            System.out.println("Bruchrechner");
            System.out.println("Bruch 1: " + a.toString());
            System.out.println("Bruch 2: " + b.toString());
            System.out.println("");
            System.out.println("Aktionen:");
            System.out.println("x: Programm beenden");
            System.out.println("1: Bruch 1 eingeben");
            System.out.println("2: Bruch 2 eingeben");
            System.out.println("b: Brüche kürzen");
            System.out.println("*: Brüche multiplizieren");
            System.out.println("/: Brüche dividieren");
            System.out.println("+: Brüche addieren");
            System.out.println("-: Brüche subtrahieren");
            System.out.println("n: Bruch 1 negieren");
            System.out.println("k: Kehrwert von Bruch 1");
            System.out.println("d: Double Wert von Bruch 1");
            System.out.println("");
            char input = IOTools.readChar("Eingabe: ");
            switch (input) {
                case 'x':
                    programRunning = false;
                    break;
                case '1':
                    a.read();
                    break;
                case '2':
                    b.read();
                    break;
                case 'b':
                    a.kuerze();
                    b.kuerze();
                    break;
                case '*':
                    System.out.println(a.mul(b).toString());
                    break;
                case '/':
                    System.out.println(a.div(b).toString());
                    break;
                case '+':
                    System.out.println(a.add(b).toString());
                    break;
                case '-':
                    System.out.println(a.sub(b).toString());
                    break;
                case 'n':
                    System.out.println(a.neg().toString());
                    break;
                case 'k':
                    System.out.println(a.kehrWert().toString());
                    break;
                case 'd':
                    System.out.println(a.wert());
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
            System.out.println("");
            System.out.println("");
        }
    }
}
