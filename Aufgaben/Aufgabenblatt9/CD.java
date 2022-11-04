package Aufgaben.Aufgabenblatt9;

public class CD {
    public String titel;
    public double spieldauer;
    public boolean ausleihstatus;

    public CD(String titel, double spieldauer, boolean ausleihstatus){
        this.titel = titel;
        this.spieldauer = spieldauer;
        this.ausleihstatus = ausleihstatus;
    }

    public String toString(){
        return titel + " (" + spieldauer + ")";
    }
}
