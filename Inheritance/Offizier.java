package Inheritance;

public class Offizier extends Mitarbeiter{
    private  String abteilung;
    private String uberstunde;
    Offizier (String name,String handyNo,String email,String abteilung,String uberstunde){
        super(name,handyNo,email);
        this.abteilung=abteilung;
        this.uberstunde=uberstunde;

    }


    public void arbetit() {
        System.out.println(this.getName()+" arbeitet in der Personalabteilung.");

    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }

    public String getUberstunde() {
        return uberstunde;
    }

    public void setUberstunde(String uberstunde) {
        this.uberstunde = uberstunde;
    }
}
