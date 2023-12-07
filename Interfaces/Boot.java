package Interfaces;

public class Boot extends Fahrzeug implements ISchwimfaehig{
    Boot(){
        super();
    }
    @Override
    public void schwimmen(){
        System.out.println("Boot  kann über Wasser bleiben");
    }
}
