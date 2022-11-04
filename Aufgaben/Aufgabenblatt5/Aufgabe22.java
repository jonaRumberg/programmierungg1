package Aufgaben.Aufgabenblatt5;

import Prog1Tools.IOTools;

public class Aufgabe22 {
    public static void main(String[] args) {
        //weihnachtsbaum ausgeben
        int zeilen = IOTools.readInt("Wie viele Zeilen soll der Weihnachtsbaum haben? ");
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < zeilen-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < zeilen; i++) {
            System.out.print(" ");
        }
        System.out.print("|");
    }
}
