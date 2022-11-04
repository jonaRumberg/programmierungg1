package Aufgaben.Aufgabenblatt8;

import Prog1Tools.IOTools;

// Implementieren Sie in einem Java-Programm zun¨achst eine Methode, die die Quersumme einer longZahl liefert. 
// Realisieren Sie dann die Methode main so, dass eine long-Zahl x eingelesen wird und
// diese danach so lange durch ihre Quersumme ersetzt wird, bis x nur noch aus einer Ziffer besteht.
// Diese Ziffer soll dann ausgegeben werden. Wie oft muss die Schleife h¨ochstens durchlaufen werden?
// Die Schleife muss höchstens drei mal durchlaufen werden
public class Aufgabe30 {
    public static void main(String[] args) {
        long i = IOTools.readLong("i: ");
        int ops = 0;
        while (i/10>=1) {
            ops++;
            i = quersumme(i);
        }
        System.out.println("ops: " + ops);
        System.out.println(i);
    }

    public static long quersumme(long x) {
        long res = 0;
        while (x > 0) {
            res +=  x % 10;
            x /= 10;
        }
        return res;
    }
}
