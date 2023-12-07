package Interfaces;

import java.util.ArrayList;
import java.util.List;

public abstract class Fahrzeug {
    public  static List<Fahrzeug> fahrzeuge=new ArrayList<>();

    protected Fahrzeug() {
        fahrzeuge.add(this);
    }
}
