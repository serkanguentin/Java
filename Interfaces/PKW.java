package Interfaces;

public class PKW  {
    public final TankfüllstandLeuchte leuchte=new TankfüllstandLeuchte("ROT");
    public ITankfüllstandBeobachter tankfüllstandBeobachter;

    public TankfüllstandLeuchte getLeuchte()  {
        return  leuchte;
    }
    private int tankfüllstand;


    public void  onTankfüllstandNiedrig(){

    }
    public void addTankfüllstand(int value){
        tankfüllstand +=value;
        if(tankfüllstand>15){
            leuchte.setFarbe("Grün");
        }

    }
    public PKW(int tankfüllstand)
    {
        addTankfüllstand(tankfüllstand);
    }
    public void fahren() throws InterruptedException
    {
        // Solange Tankfüllstand größer 0
        while (tankfüllstand > 0)
        {
            // Ziehe vom Tank ab
            tankfüllstand--;
            System.out.println("Auto: Brumm...");

            Thread.sleep(50); // Warte eine halbe Sekunde

            if (tankfüllstand < 10)
            {
                System.out.println("Tankleuchte blinkt rot");
                leuchte.setFarbe("ROT");
                tankfüllstandBeobachter.onTankfüllstandNiedrig(this);
            }
            else if (tankfüllstand < 15)
            {
                System.out.println("Tankleuchte blinkt gelb");
                leuchte.setFarbe("GELB");
                tankfüllstandBeobachter.onTankfüllstandNiedrig(this);
            }

        }
    }

}
