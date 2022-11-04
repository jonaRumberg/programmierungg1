package Aufgaben.Aufgabenblatt4;

public class Aufgabe16 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //man kann a und b nicht mit == vergleichen, da es sich um Referenzen handelt

        System.out.println(compareTwoArrays(a, b));
    }

    public static boolean compareTwoArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
