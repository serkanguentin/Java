package Interfaces;

public class Auto extends Fahrzeug implements IFahrbar{

    @Override
    public void fahren(){
        System.out.println("Dieses Fahrzeug kann nur auf Straßen fahren.");
    }
}
