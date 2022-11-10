package Aufgaben.Aufgabenblatt11.Aufgabe47;

public class FarbFernseher extends Fernseher {

    @Override
    public String toString() {
        return super.toString()+
                ", c=" + farbe;
    }

    private int farbe = 0; // Farbe des Fernsehers von 1 bis 50

    public FarbFernseher(String ra, int vo, int pr, int fa) { // Konstruktor
        super(ra, vo, pr);
        farbe = Math.max(1, Math.min(fa, 50)); // farbe im Bereich [1,50]
    }

    @Override
    public void change(String einstell, int wert) { // ver�ndert die zu 'einstell'
        if (einstell.equals("color")) {
            farbe = farbe + wert; // um 'wert'
            farbe = Math.max(1, Math.min(farbe, 50));
        } else {
            super.change(einstell, wert);
        }
    }

    public boolean istAngenehmerAls(FarbFernseher f) {
        return (this.getVolume() < f.getVolume() && (farbe < 40) && farbe > f.farbe);
    }

    
}
