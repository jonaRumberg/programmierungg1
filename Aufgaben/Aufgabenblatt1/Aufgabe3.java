package Aufgaben.Aufgabenblatt1;
import Prog1Tools.IOTools;
public class Aufgabe3 {
// Schreiben Sie ein Programm, das Sie auffordert, Namen und Alter einzugeben. Das Programm soll
// Sie danach mit Ihrem Namen begrußen und Ihr Alter ¨ in Tagen ausgeben.
    public static void main(String[] args) {
       String name = IOTools.readLine("Name: ");
       int alter = IOTools.readInt("Alter: ");

       System.out.println("Hallo " + name + "! Sie sind " + alter * 365 + " Tage alt.");
    }
}
