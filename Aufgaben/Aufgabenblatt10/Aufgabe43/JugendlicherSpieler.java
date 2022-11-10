package Aufgaben.Aufgabenblatt10.Aufgabe43;

import Aufgaben.Aufgabenblatt10.Aufgabe42.Tennisspieler;

public class JugendlicherSpieler extends Tennisspieler {
    private double körpergröße; // in cm

    public JugendlicherSpieler(String name, int alter, Tennisspieler verfolger, double körpergröße) {
        super(name, alter, verfolger);
        this.körpergröße = körpergröße;
    }

    public JugendlicherSpieler(String name, int alter, double köpergröße) {
        super(name, alter);
        this.körpergröße = köpergröße;
    }

    public double getKörpergröße() {
        return körpergröße;
    }
}
