package Aufgaben.Aufgabenblatt9;

public class Sound {

    private String raum;
    private int lautstaerke;
    private int baeße;
    private int hoehen;


    public Sound(String raum, int laut, int bass, int hoch) {
        this.raum = raum;
        this.lautstaerke = laut;
        this.baeße = bass;
        this.hoehen = hoch;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void verstaerke(String regler, int wert) {
        if (regler.equals("lautstaerke")) {
            this.lautstaerke += wert;
        } else if (regler.equals("baesse")) {
            this.baeße += wert;
        } else if (regler.equals("hoehen")) {
            this.hoehen += wert;
        }
    }

    @Override
    public String toString() {
        return "Sound [raum=" + raum + ": la=" + lautstaerke + ", b=" + baeße + ", h=" + hoehen + "]";
    }

}
