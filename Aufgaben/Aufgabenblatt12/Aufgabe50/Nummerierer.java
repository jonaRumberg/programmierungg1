package Aufgaben.Aufgabenblatt12.Aufgabe50;

interface Nummerierer {
    // Methode zur Herstellung des Anfangszustandes
    // (Nummerierung beginnt wieder von vorne)
    void reset();

    // Methode, die die jeweils nächste "Nummer" in Form
    // einer Zeichenkette liefert
    String next();

    // Methode, die anzeigt, ob noch weitere "Nummern"
    // verfügbar sind (true) oder nicht (false)
    boolean available();
}
