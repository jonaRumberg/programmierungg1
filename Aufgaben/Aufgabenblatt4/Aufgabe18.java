package Aufgaben.Aufgabenblatt4;

public class Aufgabe18 {
    public static void main(String[] args) {
        // int[][][] feld = new int[6][10][7];

        // alternative deklaration
        int[][][] feld = new int[6][][];

        for (int d1 = 0; d1 < 6; d1++) {
            feld[d1] = new int[10][];
            for (int d2 = 0; d2 < 10; d2++) {
                feld[d1][d2] = new int[7];
            }
        }
    }
}
