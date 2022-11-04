package Aufgaben.Aufgabenblatt3;

import Prog1Tools.IOTools;

public class Aufgabe15 {
    public static void main(String[] args) {
        System.out.println("Willkommen beim Zahlenraten");
        System.out.println("Ich denke mir eine Zahl zwischen 0 und 100. Rate diese Zahl!");
        int geheimZahl = (int) (99 * Math.random() + 1);
        int gerateneZahl = -1;
        int i = 0;
        while (true) {
            i++;
            gerateneZahl = IOTools.readInt(i + ". Versuch: ");
            if (gerateneZahl == geheimZahl) {
                System.out.println("Du hast die Zahl beim " + i + ". Versuch erraten!");
                return;
            } else {
                if (geheimZahl < gerateneZahl) {
                    System.out.println("Meine Zahl ist kleiner!\n");
                } else {
                    System.out.println("Meine Zahl ist größer!\n");
                }
            }
        }
    }
}
