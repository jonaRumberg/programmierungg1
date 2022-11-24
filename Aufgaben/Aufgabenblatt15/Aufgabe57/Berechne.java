package Aufgaben.Aufgabenblatt15.Aufgabe57;

public class Berechne {
    public static void main(String[] args) {
        try {
            String op = args[0].toLowerCase();
            double a = Double.parseDouble(args[1]);

            switch (op) {
                case "sinus":
                case "sin":
                case "s":
                    System.out.println(Math.sin(a));
                    break;
                case "cosinus":
                case "cosi":
                case "cos":
                case "c":
                    System.out.println(Math.cos(a));
                    break;
                case "tangens":
                case "tan":
                case "t":
                    System.out.println(Math.tan(a));
                    break;

                default:
                    System.out.println(String.format("%s is no valid Operation!", op));
                    break;
            }
        } catch (IndexOutOfBoundsException indout) {
            System.out.println("Bitte geben Sie einen Operator und eine Zahl als Argument ein!");
        } catch (NumberFormatException numfor) {
            System.out.println("Bitte geben Sie eine Zahl als zweites Argument ein!");
        }
        
    }
}
