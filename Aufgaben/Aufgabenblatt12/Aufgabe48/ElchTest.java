package Aufgaben.Aufgabenblatt12.Aufgabe48;

public class ElchTest {
    public static void main(String[] args) {
        AKlasse a = new AKlasse();
        System.out.println("a mit Tempo " + a.t + " bzw. " + a.tempo());
        CKlasse c = new CKlasse();
        System.out.println("c mit Tempo " + c.t + " bzw. " + c.tempo());
        AKlasse x = c;
        System.out.println("x mit Tempo " + x.t + " bzw. " + x.tempo());
    }
    // Output:
    // a mit Tempo 100 bzw. 100
    // c mit Tempo 200 bzw. 200
    // x mit Tempo 100 bzw. 200
}
