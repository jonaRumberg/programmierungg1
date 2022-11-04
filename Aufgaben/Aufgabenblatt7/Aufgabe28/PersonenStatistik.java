package Aufgaben.Aufgabenblatt7.Aufgabe28;

import Prog1Tools.IOTools;

public class PersonenStatistik {
    public static void main(String[] args) {
        int personenAnzahl = IOTools.readInt();
        Person[] personen = new Person[personenAnzahl];

        // Personen einlesen
        for (int i = 0; i < personenAnzahl; i++) {
            personen[i] = new Person();
            // System.out.println("Person " + (i + 1) + ":");
            personen[i].vorname = IOTools.readString();
            personen[i].name = IOTools.readString();
            personen[i].alter = IOTools.readInt();
            personen[i].personalnummer = i;
        }

        // Personenstatistik berechnen
        int maxAlter = 0;
        int minAlter = 200;
        Person jüngstePerson = new Person();
        double mittelWertAlter = 0;
        double varianzAlter = 0;

        //maximales Alter berechnen
        for (int i = 0; i < personenAnzahl; i++) {
            if (personen[i].alter > maxAlter) {
                maxAlter = personen[i].alter;
            }
        }

        //minimales Alter berechnen
        for (int i = 0; i < personenAnzahl; i++) {
            if (personen[i]. alter < minAlter) {
                minAlter = personen[i].alter;
                jüngstePerson = personen[i];
            }
        }

        //mittleres Alter berechnen
        for (int i = 0; i < personenAnzahl; i++) {
            mittelWertAlter += personen[i].alter;
        }
        mittelWertAlter /= personenAnzahl;

        //Varianz berechnen
        for (int i = 0; i < personenAnzahl; i++) {
            varianzAlter += Math.pow(personen[i].alter - mittelWertAlter, 2);
        }
        varianzAlter /= personenAnzahl;

        // Ausgabe
        System.out.println("Die Statistik der eingegebenen Personen:");
        System.out.println("Maximales Alter: " + maxAlter);
        System.out.println("Minimales Alter: " + minAlter + " " + jüngstePerson.name + " " + jüngstePerson.vorname);
        System.out.println("Mittleres Alter: " + mittelWertAlter);
        System.out.println("Varianz des Alters: " + varianzAlter);

    }
}
