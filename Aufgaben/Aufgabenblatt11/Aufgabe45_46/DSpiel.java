package Aufgaben.Aufgabenblatt11.Aufgabe45_46;

import Prog1Tools.IOTools;

public class DSpiel {
    public static void main(String[] args) {
        System.out.println("Spieler 1:");
        char x = IOTools.readChar("X-Koordinate: ");
        int y = IOTools.readInt("Y-Koordinate: ");
        String f = IOTools.readString("Farbe: ");
        DameFigur beute = new DameFigur(x, y, f);
        Bildschirm.loeschen();

        System.out.println("Spieler 2:");
        x = IOTools.readChar("X-Koordinate: ");
        y = IOTools.readInt("Y-Koordinate: ");
        f = IOTools.readString("Farbe: ");
        DameFigur jager = new DameFigur(x, y, f);

        boolean dameGefangen = false;

        if (beute.trifft(jager)) {
            dameGefangen = true;
        }
        for (int i = 0; i < 10; i++) {
            if (dameGefangen) {
                break;
            }
            System.out.println("Leider kein Treffer!");
            System.out.println("Ihre Dame steht auf Feld " + jager.getXpos() + jager.getYpos());
            System.out.println("Ziehen Sie die Dame:");
            char richtung = IOTools.readChar("Richtung: ");
            int anzahl = IOTools.readInt("Anzahl: ");
            jager.ziehe(richtung, anzahl);
            if (beute.trifft(jager)) {
                dameGefangen = true;
                break;
            } else {
            }
        }
        if (!dameGefangen) {
            System.out.println("Die Dame von " + beute.getFarbe() + " konnte nicht gefangen werden!");
            System.out.println("Spieler 1 hat gewonnen!");
        } else {
            System.out.println(
                    "Die Dame von " + beute.getFarbe() + " wurde von der Dame von " + jager.getFarbe() + " gefangen!");
            System.out.println("Spieler 2 hat gewonnen!");
        }
    }
}
