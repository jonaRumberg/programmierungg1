package Aufgaben.Aufgabenblatt3;

import Prog1Tools.IOTools;

public class Aufgabe12 {
    public static void main(String[] args) {
        double betrag = IOTools.readDouble("Anzulegender Geldbetrag in Euro: ");
        double zinsSatz = IOTools.readDouble("Jahreszins (z. B. 0.1 fuer 10 Prozent): ");
        int laufzeit = IOTools.readInt("Laufzeit (in Jahren): ");

        for (int i = 1; i <= laufzeit; i++) {
            betrag *= 1 + zinsSatz;
            System.out.println("Wert nach 1 Jahren: " + betrag);
        }
    }
}
