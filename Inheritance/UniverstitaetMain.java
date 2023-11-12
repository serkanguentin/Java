package Inheritance;

public class UniversitaetMain {
    public static void main(String[] args) {
        Mitarbeiter mitarbeiter1=new Mitarbeiter("Heinzer","012912","heinzer@gmail.com");
        mitarbeiter1.eingang();
        System.out.printf("Willkommen , "+mitarbeiter1.getName());
        mitarbeiter1.ausgang();

        Akademiker akdm1=new Akademiker("Elisa","3245445","elisa@gmail.com","Wirtschaft","Dozentin");

        akdm1.eingang(); //Dank der Vererbung können wir auf die Methoden der Klasse der
        // Mitarbeiter zugreifen, obwohl die Klasse des Akademikers nicht über diese Methoden verfügt

        akdm1.unterrrichtet();
        Offizier offizier1=new Offizier("Hans","012912","hans@gmail.com","Personalabteilung","2");
        offizier1.mensa();
        offizier1.arbetit();
    }
}
