package Interfaces;

public class TankfüllstandLeuchte {
    private  String farbe;

    public String getFarbe(){
        return this.farbe;
    }
    public  void setFarbe(String farbe){
        this.farbe=farbe;
    }
    TankfüllstandLeuchte(String  farbe){
        this.farbe=farbe;
    }
}
