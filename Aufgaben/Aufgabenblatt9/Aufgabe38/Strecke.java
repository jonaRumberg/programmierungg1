package Aufgaben.Aufgabenblatt9.Aufgabe38;

public class Strecke {
    private Punkt p;
    private Punkt q;

    public Strecke(Punkt p, Punkt q) {
        this.p = p;
        this.q = q;
    }

    public void read() {
        p.read();
        q.read();
    }

    public double getLaenge() {
        return Math.sqrt(Math.pow(p.getX() - q.getX(), 2) + Math.pow(p.getY() - q.getY(), 2));
    }

    @Override
    public String toString(){
        return p.toString() + " - " + q.toString();
    }
}
