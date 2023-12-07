package Interfaces;

public class Musiker implements  IGitarrenspieler,ISaenger{
    @Override
    public  void gitarreSpielen(){
        System.out.println("Musiker kann gitarre spielen");
    }
    @Override
    public  void singen(){
        System.out.println("Musiker kann singen");
    }
    @Override
    public void schweigen(){

    }

}
