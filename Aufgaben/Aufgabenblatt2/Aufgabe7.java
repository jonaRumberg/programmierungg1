package Aufgaben.Aufgabenblatt2;

public class Aufgabe7 {
    public static void main(String[] args) {
        // double a, b, c, d, e;
        // a = 2;
        // b = 3;
        // c = 4;
        // d = 5;
        // if (b > a)
        //     if (c > b)
        //         if (d > c)
        //             e = d;
        //         else
        //             e = c;
        //     else if (d > b)
        //         e = d;
        //     else
        //         e = b;
        // else if (c > a)
        //     if (d > c)
        //         e = d;
        //     else
        //         e = c;
        // else if (d > a)
        //     e = d;
        // else
        //     e = a;
        System.out.println("e = " + searchBiggestDouble(1, 2, 3, 4));
        // Das Programm gibt die groeßte Zahl aus
    }

    public static double searchBiggestDouble(double a, double b, double c, double d) {
        double e = a;
        if (b > e) {
            e = b;
        }
        if (c > e) {
            e = c;
        }
        if (d > e) {
            e = d;
        }

        return e;
    }
}
