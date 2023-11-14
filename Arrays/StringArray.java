package Arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] kendiArrayim=new String[5];
        kendiArrayim[0]="hallo";
        kendiArrayim[1]="mello";
        kendiArrayim[2]="Salzktten";
        kendiArrayim[3]="Delbrück";
        kendiArrayim[4]="Köln";
       // kendiArrayim[5]="Dusseldorf";
      /*  for (String i:
             kendiArrayim) {
            System.out.println(i);

        }*/
        String meininput="selam olsun, seana al banea ,bbir küleah hadi bakalim";
        String[] aufTeilung=meininput.split("e");
        for (String i: aufTeilung) System.out.println(i);
    }
}
