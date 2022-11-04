package Aufgaben.Aufgabenblatt8.Aufgabe31;

import Prog1Tools.IOTools;

public class Rechnen {
    public static void main(String[] args) {
        int a = IOTools.readInt("a: ");
        int b = IOTools.readInt("b: ");
        System.out.println(ggt(a, b));
    }

    public static int ggt(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        int x = Math.abs(a);
        int y = Math.abs(b);
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return x;
    }
}
