package Aufgaben.Aufgabenblatt13.Aufgabe53;

public class RausWieReinListe implements WarteListe{

    private Patient[] liste = new Patient[1000];
    private int anzahl = 0;
    private int indexNaechster = 0;

    @Override
    public void rein(Patient p) {
        liste[anzahl] = p;
        anzahl++;
    }

    @Override
    public Patient raus() {
        if (anzahl == 0 || indexNaechster == anzahl) {
            return null;
        }
        Patient p = liste[indexNaechster];
        indexNaechster++;
        return p;
    }

}
