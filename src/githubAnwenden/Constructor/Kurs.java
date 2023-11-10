package SchuleSystem;
public class Kurs {
   private String kursName;
   private String code;
   private Lehrer lehrer;

    public Kurs(String kursName, String code,Lehrer lehrer) {
        this.kursName = kursName;
        this.code = code;
        this.lehrer=lehrer;
    }

    public String getKursName() {
        return kursName;
    }

    public void setKursName(String kursName) {
        this.kursName = kursName;
    }

    public String getCode() {
        return code;
    }

    public Lehrer getLehrer() {
        return lehrer;
    }

    public void setLehrer(Lehrer lehrer) {
        this.lehrer = lehrer;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public double durchSchnitt(Schueler[] schuelers ){
        double durchschnitt=0;
        for(int i=0;i<schuelers.length;i++)
        {
            durchschnitt +=schuelers[i].getNote();
        }
        return durchschnitt/schuelers.length;
    }

  /*  public Lehrer getLehrer() {
        return lehrer;
    }

    public void setLehrer(Lehrer lehrer) {
        this.lehrer = lehrer;
    }*/
}
