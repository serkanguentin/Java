package SchuleSystem;

public class Schueler {
    private String name;
   private String vorname;
   private String schul_no;
   private String anschrift;
   private int note;


    Schueler(String name,String vorname,String schul_no,String anschrift,int note){
        this.name=name;
        this.vorname=vorname;
        this.schul_no=schul_no;
        this.anschrift=anschrift;
        if (note<0||note>100){
            note=0;
        }
        this.note=note;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getSchul_no() {
        return schul_no;
    }

    public void setSchul_no(String schul_no) {
        this.schul_no = schul_no;
    }

    public String getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
