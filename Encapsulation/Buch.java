package Bibliothek;

public class Buch {
    private String name;
    private int seite;

    Buch(String name, int seite) {
        this.name = name;
        this.seite = seite;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeite() {
        return seite;
    }

    public void setSeite(int seite) {
        this.seite = seite;
    }
}
