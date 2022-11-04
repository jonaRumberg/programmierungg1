package Aufgaben.Aufgabenblatt3;


import Prog1Tools.IOTools;

public class Aufgabe13 {
    public static void main(String[] args) {
        int zeilen = IOTools.readInt();
        for (int i = 1; i < zeilen+1; i++) {
            String p = "";
            for (int j = 0; j < i; j++) {
                p+="*";
            }
            System.out.println(p);
        }
    }
}
