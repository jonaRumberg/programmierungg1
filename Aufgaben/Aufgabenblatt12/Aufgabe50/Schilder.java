package Aufgaben.Aufgabenblatt12.Aufgabe50;

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


// Nummerierer als Interface zu implementieren ist möglich, 
// es können die public und abstract schlüsseslworte weggelassen werden.