package Aufgaben.Aufgabenblatt15.Aufgabe56;

public class Gleichung {

    double a, b, c;

    public Gleichung(String a, String b, String c) {
        this.a = Double.parseDouble(a);
        this.b = Double.parseDouble(b);
        this.c = Double.parseDouble(c);
    }

    public Loesung berechneLoesung() throws UnloesbarException, NichtquadratischException {
        if ((b*b) - (4*a*c) < 0) {
            throw new UnloesbarException(String.format("(%1f*%2f) - (4*%3f*%4f) < 0", b, b, a, c));
        }
        if(a == 0) {
            throw new NichtquadratischException(String.format("%f = 0", a));
        }
        double x1 = (-b + Math.sqrt((b*b) - (4*a*c))) / (2*a);
        double x2 = (-b - Math.sqrt((b*b) - (4*a*c))) / (2*a);
        return new Loesung(x1, x2);
    }

}
