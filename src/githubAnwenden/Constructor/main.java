package SchuleSystem;

public class Main {
    public static void main(String[] args) {


      Schueler schueler1=new Schueler("Müller","Sabina","1256","Mondsctraße 12",95);
      Schueler schueler2=new Schueler("Schmit","Stefan","123","Rosestraße 67",97);
      Schueler schueler3= new Schueler("Zoe","Moe","323","Kürbissatraße 21",110);
       schueler3.setNote(97);
       // System.out.println(schueler3.getNote());
    Lehrer lehrer=new Lehrer("kara","ramo","01324912");
        Kurs math=new Kurs("Mathematik","MATH",lehrer);
        //Schueler[] schuler={schueler1,schueler2,schueler3};
        System.out.println(math.getLehrer().getName());

    }
}
