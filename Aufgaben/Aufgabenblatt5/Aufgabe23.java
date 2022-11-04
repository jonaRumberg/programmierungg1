package Aufgaben.Aufgabenblatt5;

import Prog1Tools.IOTools;

public class Aufgabe23 {
    public static void main(String[] args) {
        // magisches Quadrat
        int n = 0;
        while (n < 2 || n % 2 == 0 || n > 10) {
            n = IOTools.readInt("n: ");
        }
        int[][] quad = new int[n][n];
        int zeile = n / 2;
        int spalte = n / 2 + 1;
        for (int i = 1; i <= n * n; i++) {
            quad[zeile][spalte] = i;
            spalte++;
            zeile--;
            if (zeile < 0)
                zeile = n - 1;
            if (spalte == n)
                spalte = 0;
            if (quad[zeile][spalte] != 0) {
                zeile++;
                spalte++;
                if (zeile == n)
                    zeile = 0;
                if (spalte == n)
                    spalte = 0;
            }
        }
        print2dArray(quad);
    }

    public static void print2dArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
