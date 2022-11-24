package Klausurenaufgabensammlung;

public class Aufgabe1 {
    public static void main(String[] args) {
        System.out.println(root(125, 3));
    }

    public static double root(double a, int n) {
        double i = Math.sqrt(a);
        boolean bedingung = true;
        while (bedingung) {
            double j = ((n - 1) * i + (a / Math.pow(i, (n - 1)))) / n;
            bedingung = Math.abs(j - i) >= Math.pow(10, -10) * Math.abs(j);
            System.out.println(i);
            i = j;
        }
        return i;
    }
}
