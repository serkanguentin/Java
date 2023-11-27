package Assoziationen;

public class Klausur {
    private  Fach id;
    private  int note;

    public Klausur(Fach id, int note) {
        this.id = id;
        this.note = note;
    }

    public Fach getId() {
        return id;
    }

    public int getNote() {
        return note;
    }
}
