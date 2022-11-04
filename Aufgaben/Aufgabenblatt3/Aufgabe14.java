package Aufgaben.Aufgabenblatt3;

import Prog1Tools.IOTools;

public class Aufgabe14 {
    public static void main(String[] args) {
        int eing = IOTools.readInt();
        String eingString = eing + "";

        for (int i = eingString.length()-1; i >= 0; i--) {
            char b = eingString.charAt(i);
            switch (b) {
                case '0':
                    System.out.println("Null");
                    break;
                case '1':
                    System.out.println("Eins");
                    break;
                case '2':
                    System.out.println("Zwei");
                    break;
                case '3':
                    System.out.println("Drei");
                    break;
                case '4':
                    System.out.println("Vier");
                    break;
                case '5':
                    System.out.println("Fünf");
                    break;
                case '6':
                    System.out.println("Sechs");
                    break;
                case '7':
                    System.out.println("Sieben");
                    break;
                case '8':
                    System.out.println("Acht");
                    break;
                case '9':
                    System.out.println("Neun");
                    break;

                default:
                    break;
            }
        }
    }
}
