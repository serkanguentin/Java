package Bibliothek;

public class Main {
    public static void main(String[] args) {
        Buch buch1=new Buch("Harry Potter",100);
        Buch buch2=new Buch("Lord of The Rings",110);

        buch2.setName("Love");
        System.out.println(buch2.getName());
        buch2.setSeite(-129);
        System.out.println(buch2.getSeite());

    }
}
