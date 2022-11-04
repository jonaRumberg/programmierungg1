package Aufgaben.Aufgabenblatt1;
import Prog1Tools.IOTools;

public class Aufgabe4 {
// Schreiben Sie ein Programm, das einen Sekunden-Wert in einer int-Variablen sec speichert und
// diesen Wert in Jahre, Tage, Stunden, Minuten und Sekunden zerlegt. Das Programm soll z. B.
// folgendes ausgeben:
// 158036521 Sekunden entsprechen:
// 5 Jahren,
// 4 Tagen,
// 3 Stunden,
// 2 Minuten und
// 1 Sekunden.

   public static void main(String[] args) {
        int sec = IOTools.readInt("Sekunden: ");

        int yrs = sec / (365*24*60*60);
        sec %= (365*24*60*60);

        int dys = sec / (24*60*60);
        sec %= (24*60*60);

        int hrs = sec / (60*60);
        sec %= (60*60);

        int min = sec / (60);
        sec %= (60);

        System.out.println("Years: " + yrs);
        System.out.println("Days: " + dys);
        System.out.println("Hours: " + hrs);
        System.out.println("Minutes: " + min);
        System.out.println("Seconds: " + sec);

  } 
}
