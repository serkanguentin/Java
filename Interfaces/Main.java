package Interfaces;

public class Main {
    public static void main(String[] args) {
        Musiker musiker1=new Musiker();
        musiker1.singen();
        musiker1.gitarreSpielen();
        musiker1.schweigen();
        Fahrzeug auto1=new Auto();
        Boot boot1=new Boot();
        Flugzeug flugzeug1=new Flugzeug();
        Bagger bagger1=new Bagger();

        for (Fahrzeug i : Fahrzeug.fahrzeuge
             ) {
            System.out.println(i.getClass().getSimpleName());
            if (i instanceof IFlugfaehig a)
                a.fliegen();


        }
    }
}
