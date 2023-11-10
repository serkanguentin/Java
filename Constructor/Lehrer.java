package SchuleSystem;

public class Lehrer {
    private String name;
    private String handyno;
    private String branche;
    Lehrer(String name,String branche,String handyno){
        this.name=name;
        this.branche=branche;
        this.handyno=handyno;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHandyno() {
        return handyno;
    }

    public void setHandyno(String handyno) {
        this.handyno = handyno;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }
}
