/*
 * Zwei Klassen:
 * "Buch" mit dem Attribut "titel" (public get)
 * "Autor" mit dem Attribut "name" (public get)
 * jeweils einen Konstruktor, der die Eigenschaften initialisiert.
 * Implementieren Sie die Assoziation der beiden Klassen und stellen Sie eine bidirektionale Navigierbarkeit her.
 * Dazu müssen Sie den Klassen weitere Member hinzufügen.
 * (Gehen Sie davon aus, dass ein Buch mehrere Autoren haben und ein Autor mehrere Bücher verfassen kann)
 * Testen Sie das Programm im Main.
 */
package Assoziationen;

public class Main2 {
    Buch buch1=new Buch("Buch1");
    Buch buch2=new Buch("Buch2");
    Buch buch3=new Buch("Buch3");
    Autor autor1=new Autor("Selam");
    Autor autor2=new Autor("Kelam");

}
