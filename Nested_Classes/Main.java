package Nested_Classes;

public class Main {
    public static void main(String[] args) {
        String s;//undefined
        String k=null;//null
        String l="";//empty
        GenericClasses<String> gen=new GenericClasses<>("Probe");
        gen.run();
        GenericClasses<Integer> gen2=new GenericClasses<>(12);
        gen2.run();

        String str="probe";
        Integer int1=12;
        Double dob=1.2;
        GenericTest<String,Integer,Double> gen4=new GenericTest<>(str,int1,dob);
        gen4.showInfo();
    }
}
