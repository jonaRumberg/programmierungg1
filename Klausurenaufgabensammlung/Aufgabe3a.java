package Klausurenaufgabensammlung;

public class Aufgabe3a {
    public static void tuWas(int x, int y, int z) {
        System.out.println("iii");
    }

    public static void tuWas(int x, int y, double z) {
        System.out.println("iid");
    }

    public static void tuWas(int x, double y, double z) {
        System.out.println("idd");
    }

    public static void tuWas(double x, int y, double z) {
        System.out.println("did");
    }

    public static void main(String[] args) {
        int a = 123;
        double b = 4.56;
        tuWas(a, a, a); // Aufruf 1
        tuWas(a, a, b); // Aufruf 2
        tuWas(a, b, a); // Aufruf 3
        tuWas(a, b, b); // Aufruf 4
        // tuWas(b, b, b); // Aufruf 5
        tuWas(b, a, b); // Aufruf 6
        tuWas(b, a, a); // Aufruf 7
    }

}
