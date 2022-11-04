package Aufgaben.Aufgabenblatt7.Aufgabe28;

import Prog1Tools.IOTools;

/**
 * Sortiert ein Array von Personen nach dem Alter.
 */
public class PersonenSort {
    public static void main(String[] args) {
        int personenAnzahl = IOTools.readInt();
        Person[] personen = new Person[personenAnzahl];   
        
        //Personen einlesen
        for (int i = 0; i < personenAnzahl; i++) {
            personen[i] = new Person();
            System.out.println("Person " + (i + 1) + ":");
            personen[i].vorname = IOTools.readString("Vorname: ");
            personen[i].name = IOTools.readString("Name: ");
            personen[i].alter = IOTools.readInt("Alter: ");
            personen[i].personalnummer = IOTools.readInt("Personalnummer: ");
        }

        //Personen sortieren
        for (int i = 0; i < personenAnzahl; i++) {
            int j = 0;
            while (j < personenAnzahl-1) {
                if (personen[j].alter>personen[j+1].alter) {
                    Person temp = personen[j];
                    personen[j] = personen[j+1];
                    personen[j+1] = temp;
                }
                j++;
            }
        }

        //Personen ausgeben
        System.out.println("Die eingegebenen Personen in aufsteigender Reihenfolge:");
        for (int i = 0; i < personenAnzahl; i++) {
            System.out.println(personen[i].vorname + " " + personen[i].name + " " + personen[i].alter + " " + personen[i].personalnummer);
        }
    }
}
