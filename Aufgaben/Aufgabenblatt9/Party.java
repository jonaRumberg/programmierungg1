package Aufgaben.Aufgabenblatt9;

import Prog1Tools.IOTools;

public class Party {
    public static void main(String[] args) {
        //Create and read data for multiple CDs
        int count = IOTools.readInt("Wie viele CDs willst du eingeben? ");
        CD[] cds = new CD[count];
        einlesen(cds);
        sortieren(cds);
        ausgeben(cds);
    }
    public static void einlesen(CD[] cdf) {
        for (int i = 0; i < cdf.length; i++) {
            String titel = IOTools.readLine();
            double spieldauer = IOTools.readDouble();
            boolean ausgeliehen = IOTools.readBoolean();
            cdf[i] = new CD(titel, spieldauer, ausgeliehen);
        }
    }

    public static void sortieren(CD[] cdf) {
        for (int i = 0; i < cdf.length-1; i++) {
            //get longest playing cd in the range of i to n-1
            int m = i;
            for (int j = i; j < cdf.length; j++) {
                if(cdf[m].spieldauer < cdf[j].spieldauer) m = j;
            }
            //swap longest playing cd with i
            CD temp = cdf[i];
            cdf[i] = cdf[m];
            cdf[m] = temp;
        }
    }

    public static void ausgeben(CD[] cdf) {
        for (int i = 0; i < cdf.length; i++) {
            if(!cdf[i].ausleihstatus) System.out.println(cdf[i].toString());
        }
    }
}
