package Aufgaben.Aufgabenblatt2;

public class Aufgabe9 {
    public static void main(String[] args) {
        System.out.println("For Loop: ");
        algWithFor(4);

        System.out.println("While Loop: ");
        algWithWhile(4);
        
        System.out.println("Do While Loop: ");
        algWithDoWhile(4);

    }

    public static double algWithFor(double n) {
        double res = 0;
        double i;
        for (i = 3; i < 2 * n; i += 0) {
            i++;
            res = 3.14 / (2 * i - 1);
            System.out.println(res);
        }

        return res;
    }

    public static double algWithWhile(double n) {
        double res = 0;
        double i = 3;
        while (i < 2*n) {
           i++; 
           res = 3.14/(2*i-1);
           System.out.println(res);
        }

        return res;
    }

    public static double algWithDoWhile(double n) {
        double res = 0;
        double i = 3;
        do {
           i++; 
           res = 3.14/(2*i-1);
           System.out.println(res);
        } while (i < 2*n);

        return res;
    }
}
