package Klausurenaufgabensammlung;

public class Aufgabe2 {
    public static void main(String[] args) {
        System.out.println(newton(1.5, 0.0002));
    }

    public static double newton(double x0, double eps) {
        final double KMAX = 50;
        double xi, xk = x0;
        int i = 0;
        do {
            xi = xk;
            xk = xi - (Math.sin(xi) / Math.cos(xi));
            System.out.println(xi);
            i++;
            if (i >= KMAX)
                return -1;
        } while (Math.abs(xk - xi) > eps * Math.abs(xk));
        return xk;
    }
}
