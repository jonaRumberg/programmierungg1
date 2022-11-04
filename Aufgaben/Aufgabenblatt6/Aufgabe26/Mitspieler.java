package Aufgaben.Aufgabenblatt6.Aufgabe26;

import Prog1Tools.IOTools;

public class Mitspieler {
    public static int gesamtzahl = 0;
    public static Mitspieler[] alleMitspieler;
    public static int MitspielerNummern[];
    public int nummer;
    public String name;

    public static void main(String[] args) {
        gesamtzahl = IOTools.readInt("Wie viele Mitspieler sollen erzeugt werden? ");
        alleMitspieler = new Mitspieler[gesamtzahl];
        MitspielerNummern = new int[gesamtzahl];
        for (int i = 0; i < gesamtzahl; i++) {
            alleMitspieler[i] = new Mitspieler();
            boolean nummerVergeben = true;
            while (nummerVergeben) {
                int nummer = IOTools.readInt("Bitte geben Sie die Nummer des " + (i + 1) + ". Mitspielers ein: ");
                nummerVergeben = false;
                for(int j = 0; j < i; j++) {
                    if (nummer == alleMitspieler[j].nummer) {
                        System.out.println("Diese Nummer ist schon vergeben");
                        nummerVergeben = true;
                    }
                }
                MitspielerNummern[i] = nummer;
                alleMitspieler[i].nummer = nummer;
            }
            
            alleMitspieler[i].name = IOTools.readString("Bitte geben Sie den Namen des " + (i + 1) + ". Mitspielers ein: ");
        }
        for (int i = 0; i < gesamtzahl; i++) {
            System.out.println(alleMitspieler[i].nummer + " " + alleMitspieler[i].name);
        }
    }
}
    