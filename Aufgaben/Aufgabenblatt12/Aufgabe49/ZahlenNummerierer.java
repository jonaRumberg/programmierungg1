package Aufgaben.Aufgabenblatt12.Aufgabe49;

public class ZahlenNummerierer extends Nummerierer {

    int zahl = 0;

    @Override
    public void reset() {
        zahl = 0;
    }

    @Override
    public String next() {
        zahl += 1;
        return String.valueOf(zahl);
    }

    @Override
    public boolean available() {
        return zahl < 20;
    }
    
}
