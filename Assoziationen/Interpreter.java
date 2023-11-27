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

import java.util.ArrayList;
import java.util.List;

public  class Interpreter {
    private String name;
    private final List<Song> songs = new ArrayList<Song>();

    public Interpreter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
    return songs;
    }
}