/* Aufgabe 0
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein Array "Album" vom Typ String mit der Größe 3 (Es ist ein kleines Album).
 * Fügen Sie dem Album nun 3 Songs hinzu. Dabei ist jedes Element im Array ein Song-Titel.
 * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden. Verwenden Sie Length-Eigenschaft des Arrays für die Schleifenbedingung.
 */





package Arrays;

import java.util.Arrays;

public class ArrayAlbuem {
    public static void main(String[] args) {
        String[] albuem=new String[3];
        albuem[0]="Call down";
        albuem[1]="Satisfaction :)";
        albuem[2]="Despasito";
        for (int i=0;i<albuem.length;i++){
            System.out.println(albuem[i]);
        }


    }

}
