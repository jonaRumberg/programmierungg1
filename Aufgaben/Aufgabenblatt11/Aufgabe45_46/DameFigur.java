package Aufgaben.Aufgabenblatt11.Aufgabe45_46;

public class DameFigur extends Spielfigur {
    final String NAME = "Dame";

    public DameFigur(char x, int y, String f) {
        super(x, y, f);
    }
    
    public void ziehe (char richtung, int anzahl) {
        int x = 0;
        int y = 0;
        switch (richtung) {
            case '-':
                x+=anzahl;
                break;
            case '/':
                x+=anzahl;
                y+=anzahl;
                break;
            case '|':
                y+=anzahl;
                break;
            case '\\':
                x-=anzahl;
                y+=anzahl;
                break;
        
            default:
                System.out.println("Bitte gültige Richtung eingeben");
                break;
        }
        super.ziehe(x,y);
    }

    public boolean trifft(DameFigur a){
        return this.getXpos() == a.getXpos() && this.getYpos() == a.getYpos();
    }

    public String toString() {
        return this.getFarbe() + "e Dame auf Feld " + this.getXpos() + this.getYpos();
    }
}
