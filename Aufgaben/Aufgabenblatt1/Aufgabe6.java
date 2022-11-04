package Aufgaben.Aufgabenblatt1;

public class Aufgabe6 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6, y6;

        x1 = 10e20;
        x2 = 1223;
        x3 = 10e18;
        x4 = 10e15;
        x5 = 3;
        x6 = -10e12;

        y1 = 10e20;
        y2 = 2;
        y3 = -10e22;
        y4 = 10e13;
        y5 = 2111;
        y6 = 10e16;

        double x = 192119201;
        double y = 35675640;

        System.out.println(x1 * y1 + x2 * y2 + x3 * y3 + x4 * y4 + x5 * y5 + x6 * y6);

        System.out.println((1 / 107751) * (1682 * Math.pow(y, 2) + 3 * Math.pow(x, 3) + 29 * x * Math.pow(y, 2) - 2 * Math.pow(x, 5) + 832));

        System.out.println(((x * y * y) / 107751) * (1682 * y * y + 29) + ((x * x * x) / 107751) * (3 - 2 * x * x) + (832 / 107751));

    }
}
