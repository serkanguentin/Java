/* Aufgabe 0 (Basics)
 * Zwei Klassen:
 *  "Song" mit dem Attribut "titel"
 *  "Interpret" mit dem Attribut "name"
 * Implementieren Sie die Assoziation der beiden Klassen und stellen Sie eine bidirektionale Navigierbarkeit her.
 * Dazu müssen Sie den Klassen weitere Felder hinzufügen.
 * (Gehen Sie davon aus, dass jeder Song nur einen Interpreten, ein Interpret aber mehrere Songs hat)
 * Testen Sie das Programm im Main.
 */
package Assoziationen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Interpreter interpreter1=new Interpreter("Jennifer Lovely");
            Song song1=new Song("Love von mir",interpreter1);
        System.out.println(song1.getTitel()+" "+song1.getInterpreter().getName());
        Song song2=new Song("Jötem",interpreter1);
        System.out.println(song2.getTitel()+" "+song2.getInterpreter().getName());

        Fach fach1=new Fach("Java-Grundlage",100);
        Fach fach2=new Fach("SQL",102);
        Klausur kla1=new Klausur(fach2,93);
        Klausur kla2=new Klausur(fach1,50);
        Klausur kla3=new Klausur(fach2,63);


    }
}