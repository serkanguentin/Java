package Interfaces;

public class Bagger extends Fahrzeug implements IFahrbar,ISchwimfaehig{
    Bagger(){
        super();
    }
    @Override
    public void fahren() {
        System.out.println("Auto kann man fahren.");

    }
    @Override
    public void schwimmen(){

    }
}
