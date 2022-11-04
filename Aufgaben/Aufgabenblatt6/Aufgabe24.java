package Aufgaben.Aufgabenblatt6;

/**
 * Aufgabe24
 */
public class Aufgabe24 {
    public int a,b,c;
    //Was passiert bei der Deklaration von Variablen eines Referenzdatentyps?
    // -> Die Variablen werden auf dem Heap angelegt und erhalten einen Wert von null,
    // es wird eine Referenz auf den Speicherplatz hinterlegt

    //Was versteht man unter Erzeugung eines Objektes?
    // -> Nach dem Schema einer Klasse wird ein Referenzdatentyp instanziiert

    //Wie erfolgt die Wertzuweisung an die Komponenten eines Objekts?
    // -> Die Komponenten eines Objektes können mit Objektname.komponente angesprochen werden

    //Welche Form von Kopien gibt es bei referenzdatenypen? Erläutern sie dies an folgender Klasse:
    // public class nochEinTyp {
    //     public int h;
    //     public MeinTyp x;
    //}
    // -> Es gibt eine Kopie des Referenzdatentyps und eine Kopie des Wertdatentyps
    //  - Die Kopie des Referenzdatentyps enthält eine Referenz auf den Speicherplatz des Objekts
    //  - Die Kopie des Wertdatentyps enthält den Wert des Wertdatentyps
    //  - Die Kopie der Referenz von nochEinTyp würde durch 
    //  einAndererTyp = nochEinTyp; 
    //    entstehen
    //  - Die Kopie des Wertdatentyps würde durch 
    //  einAndererTyp.h = nochEinTyp.h;
    //  einAndererTyp.x = nochEinTyp.x;
    //    entstehen oder durch
    //  einAndererTyp = (A) nochEinTyp.clone();
    //    entstehen
}
