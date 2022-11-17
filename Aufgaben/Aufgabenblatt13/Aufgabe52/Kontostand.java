package Aufgaben.Aufgabenblatt13.Aufgabe52;

public class Kontostand extends Zahl {

    private double wert;

    public double getWert() {
        return wert;
    }

    public Kontostand(double w) {
        this.wert = w;
    }

    @Override
    public Zahl neg() {
        return new Kontostand(-wert);
    }

    @Override
    public Zahl add(Zahl kont) {
        if (kont instanceof Kontostand) {
            return new Kontostand(wert + ((Kontostand) kont).getWert());
        }
        return null;

    }

    @Override
    public String toString() {
        return String.valueOf(wert);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kontostand) {
            return wert == ((Kontostand) obj).getWert();
        }
        return false;
    }

}
