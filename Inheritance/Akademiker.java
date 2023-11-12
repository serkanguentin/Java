package Inheritance;

public class Akademiker extends  Mitarbeiter{
    private String fach;
    private String titel;
    Akademiker(String name,String handyno,String eposta,String fach,String titel){
        super(name,handyno,eposta);
        this.fach=fach;
        this.titel=titel;
    }

    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void unterrrichtet(){
        System.out.println(this.getName()+"  unterrichtet die  "+this.fach);
    }

}
