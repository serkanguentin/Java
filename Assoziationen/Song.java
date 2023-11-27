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
public class Song{
private  String titel;
private Interpreter interpreter;
Song(String titel,Interpreter interpreter){
    this.interpreter=interpreter;
    this.titel=titel;
    interpreter.getSongs().add(this);
}

    public String getTitel() {
        return titel;
    }

    public Interpreter getInterpreter() {
        return interpreter;
    }
}