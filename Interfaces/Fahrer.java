package Interfaces;

class Fahrer implements ITankfüllstandBeobachter
{
    public void tanken(PKW pkw, int value)
    {
        pkw.addTankfüllstand(value);
    }

    // Methode, mit der der Empfänger das Event abonniert hat
    public void onTankfüllstandNiedrig(PKW pkw)
    {
        if (pkw != null)
        {
            if (pkw.getLeuchte().getFarbe().equalsIgnoreCase("GELB"))
                System.out.println("Fahrer: Ach, hat noch Zeit...");
            else if (pkw.getLeuchte().getFarbe().equalsIgnoreCase("ROT"))
            {
                System.out.println("Fahrer: Jetzt aber dringend Tanken...");
                tanken(pkw, 20);
            }
        }
    }
}
