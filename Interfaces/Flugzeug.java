package Interfaces;

public class Flugzeug extends Fahrzeug implements IFlugfaehig,IFahrbar{
    Flugzeug(){
        super();
    }
    @Override
    public void fliegen(){
        System.out.println("Flugzeug kann man fliegen.");
    }
    @Override
    public void fahren(){
        System.out.println("Auto kann man fahren.");
    }
}
