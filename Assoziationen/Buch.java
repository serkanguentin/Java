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

import java.util.ArrayList;

public class Buch {

    private  String titel;
    ArrayList<Autor> autors=new ArrayList<Autor>();
    Buch(String titel){
        this.titel=titel;
    }
    public  String getTitel (){
        return this.titel;
    }
    public ArrayList<Autor> getAutors(){
        return autors;
    }
}
