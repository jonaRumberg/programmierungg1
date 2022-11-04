package Aufgaben.Aufgabenblatt9;

import Prog1Tools.IOTools;

public class TestCD {
    public static void main(String[] args) {
        String titel = IOTools.readString();
        double spieldauer = IOTools.readDouble();
        boolean ausleihstatus = IOTools.readBoolean();
        CD cd = new CD(titel, spieldauer, ausleihstatus);
        System.out.println(cd.toString());
    }   
}
