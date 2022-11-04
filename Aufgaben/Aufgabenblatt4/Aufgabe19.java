package Aufgaben.Aufgabenblatt4;

public class Aufgabe19 {
    public static void main(String[] args) {
        int[][] schachbrett = new int[8][8];
        for (int i = 0; i < schachbrett.length; i++) {
            for (int j = 0; j < schachbrett[i].length; j++) {
                schachbrett[i][j] = i+j+1;
            }
        }

        print2dArray(schachbrett);
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
