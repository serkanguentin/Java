package Inheritance;

import java.time.DateTimeException;
import java.util.Date;

public class Mitarbeiter {
   private String name;
  private String handyNo;
   private String eposta;
   Mitarbeiter(String name,String handyNo,String eposta){
       this.name=name;
       this.handyNo=handyNo;
       this.eposta=eposta;

   }
   public String getName(){
       return this.name;
   }
   public void setName(String name){
       this.name=name;
   }

    public String getHandyNo() {
        return handyNo;
    }

    public void setHandyNo(String handyNo) {
        this.handyNo = handyNo;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void eingang( ){
        System.out.println(this.name+"  ist zur Üniversität eingegangen.");
   }
    public void ausgang( ){
        System.out.println("\n"+this.name+"  ist aus der Üniversität ausgegangen.");
    }
    public void mensa( ){
        System.out.println(this.name+"  ist zur Mensa eingetreten.");
    }
}