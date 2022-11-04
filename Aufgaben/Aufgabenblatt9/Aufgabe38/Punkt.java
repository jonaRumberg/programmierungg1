package Aufgaben.Aufgabenblatt9.Aufgabe38;

import Prog1Tools.IOTools;

public class Punkt {
    double x;
    double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void read() {
        this.x = IOTools.readDouble();
        this.y = IOTools.readDouble();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
