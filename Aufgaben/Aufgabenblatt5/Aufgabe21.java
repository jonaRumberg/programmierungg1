package Aufgaben.Aufgabenblatt5;

import Prog1Tools.IOTools;

public class Aufgabe21 {
    public static void main(String[] args) {
        //zahlen einlesen und sortieren
        int count = IOTools.readInt("Wie viele Zahlen sollen eingelesen werden? ");
        int[] zahlen = new int[count];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = IOTools.readInt("Zahl " + (i+1) + ": ");
        }
        for (int i = 0; i < count; i++) {
            int j = 0;
            while (j < count-1) {
                if (zahlen[j]>zahlen[j+1]) {
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j+1];
                    zahlen[j+1] = temp;
                }
                j++;
            }
        }
        System.out.println("Die eingegebenen Zahlen in aufsteigender Reihenfolge:");
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i] + " ");
        }
    }
}
