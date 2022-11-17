package Aufgaben.Aufgabenblatt12.Aufgabe49;

public class Schilder {
    public static void beschriften(Nummerierer n) {
        // 5 Beschriftungen drucken
        for (int i = 1; i <= 5; i++)
            System.out.println("Naechste Beschriftung: " + n.next());
        // Von vorne beginnen
        n.reset();
        // Alle m¨oglichen Beschriftungen drucken
        while (n.available())
            System.out.println("Naechste Beschriftung: " + n.next());
    }
}


// • Schreiben Sie eine Klasse ZahlenNummerierer, die von Nummerierer erbt und mit einer
// int-Variable arbeitet, um die Zahlen von 1 bis 20 als Nummern zu liefern.

// • Schreiben Sie eine Klasse BuchstabenNummerierer, die von Nummerierer erbt und mit einer
// char-Variable arbeitet, um die Buchstaben von A bis Z als ”
// Nummern“ zu liefern.

// • Schreiben Sie ein Programm NummeriererTest, das (abhängig von einer Eingabe des Benutzers bzw. der Benutzerin) entweder einen Buchstaben- oder einen Zahlen-Nummerierer für
// den Aufruf der Methode beschriften der Klasse Schilder verwendet.