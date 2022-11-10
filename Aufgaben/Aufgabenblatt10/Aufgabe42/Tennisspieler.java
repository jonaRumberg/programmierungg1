package Aufgaben.Aufgabenblatt10.Aufgabe42;

public class Tennisspieler {
    public String name; // Name des Spielers
    public int alter; // Alter in Jahren
    private int startNummer; // Startnummer des Spielers

    // damit die Startnummer nicht von außen geändert werden kann, wird sie privat geschaltet, der Getter ermöglicht den Lese-Zugriff
    public int getStartNummer() {
        return startNummer;
    }

    public Tennisspieler verfolger; // Nachfolger des Spielers auf der Weltrangliste

    private static int folgeNummer = 1; // Nächste zu vergebene Startnummer

    public static void main(String[] args) {
        Tennisspieler maier = new Tennisspieler("H. Maier", 68); // maier hat startnummer 1
        Tennisspieler schmid = new Tennisspieler("G. Schmid", 45, maier); // schmid hat startnummer 2
        Tennisspieler berger = new Tennisspieler("I. Berger", 36, schmid); // berger hat startnummer 3

        System.out.println(maier);
        System.out.println(schmid);
        System.out.println(berger);

    }

    public Tennisspieler(String name, int alter, Tennisspieler verfolger) {
        this.name = name;
        this.alter = alter;
        this.verfolger = verfolger;
        this.startNummer = folgeNummer;
        folgeNummer += 1;
    }

    /**
     * Konstruktor für Tennisspieler
     * Ein Konstruktor ist eine Methode, die bei Erschaffung des Objekts aufgerufen
     * wird und die generell dafür genutzt wird, Objekt-Attribute zu
     * inititalisieren.
     * Die Anweisung TennisSpieler maier = new TennisSpieler(); wäre nun nicht mehr
     * zulässig, da der Konstruktor einen Parameter erwartet.
     * Der Konstruktor könnte jedoch auch ohne Parameter überladen werden, sodass
     * die Anweisung TennisSpieler maier = new TennisSpieler(); wieder zulässig
     * wäre.
     * 
     * @param name
     * @param alter
     */
    public Tennisspieler(String name, int alter) {
        this.name = name;
        this.alter = alter;
        this.startNummer = folgeNummer;
        folgeNummer += 1;
    }

    public boolean istLetzter() {
        return this.verfolger == null;
    }

    @Override
    public String toString() {
        String printText = name + " (" + startNummer + ")";
        if (verfolger != null)
            printText = printText + " liegt vor " + verfolger.toString();
        return printText;
    }

    public int altersDifferenz(int alter) {
        return Math.abs(alter - this.alter);
    }

}
