package Aufgaben.Aufgabenblatt2;

public class Aufgabe8 {
    public static void main(String[] args) {
        int x = 0, y = 4;
        // Beispiel A
        if (x < 5)  //kann als (x < 5 && x >= 0) vereinfacht werden, ist unnoetig weil x null ist, das else muss für das andere if gelten
            if (x < 0)
                System.out.println("x < 0");
            else
                System.out.println("x >= 5");

        // Beispiel B
        if (x > 0) //hier müssen auch klammern hin
            System.out.println("ok! x > 0");
        System.out.println("1/x = " + (1 / x));

        // Beispiel C
        if (x > 0) //auch hier fehlen klammern
            ;
        System.out.println("1/x = " + (1 / x));

        // Beispiel D
        if (y > x) { // vertausche x und y
            x = y; //der wert von x muss erst in eine Hilfsvariable, so ist x=y
            y = x;
        }
        System.out.println("x = " + x + " y = " + y);
    }

}
