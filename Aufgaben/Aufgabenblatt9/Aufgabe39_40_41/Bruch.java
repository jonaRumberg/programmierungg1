package Aufgaben.Aufgabenblatt9.Aufgabe39_40_41;

import Prog1Tools.IOTools;

public class Bruch {
    private int zaehler;
    private int nenner;

    //Objektmethoden
    
    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        if(nenner == 0) throw new ArithmeticException("Can't Divide by zero");
        this.nenner = nenner;
    }

    public Bruch(){}

    public Bruch kuerze(){
        int ggT = Bruch.ggT(this.zaehler, this.nenner);
        int nzaeler = this.zaehler / ggT;
        int nnenner = this.nenner / ggT;
        return new Bruch(nzaeler, nnenner);
    }

    public Bruch kehrWert(){
        return new Bruch(this.nenner, this.zaehler);
    }

    public Bruch neg(){
        return new Bruch(-this.zaehler, this.nenner);
    }

    public double wert(){
        return (double)this.zaehler / (double)this.nenner;
    }

    public Bruch mul(Bruch b){
        return new Bruch(this.zaehler * b.zaehler, this.nenner * b.nenner).kuerze();
    }

    public Bruch div(Bruch b){
        return this.mul(b.kehrWert());
    }

    public Bruch add(Bruch b){
        int nzaehler = this.zaehler * b.nenner + b.zaehler * this.nenner;
        int nnenner = this.nenner * b.nenner;
        return new Bruch(nzaehler, nnenner).kuerze();
    }

    public Bruch sub(Bruch b){
        return this.add(b.neg());
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public void read() {
        this.zaehler = IOTools.readInt("Zaehler: ");
        int nnenner = IOTools.readInt("Nenner: ");
        while(nnenner == 0) {nnenner = IOTools.readInt("Bitte keine Null eingeben. Nenner: ");}
        this.nenner = nnenner;
    }

    @Override
    public String toString() {
        return zaehler + "/" + nenner;
    }

    //Klassenmethoden
    public static int ggT(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        int x = Math.abs(a);
        int y = Math.abs(b);
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }
}
