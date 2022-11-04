package Aufgaben.Aufgabenblatt3;

import Prog1Tools.IOTools;

public class Aufgabe11 {
    public static void main(String[] args) {
        double n = IOTools.readDouble("Geben sie eine Zahl ein: ");
        for (int i = 0; i < 11; i++) {
           System.out.print(i*n + "   "); 
        } 
    }
}
