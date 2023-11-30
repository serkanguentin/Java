package Nested_Classes;

public class Boxing_UnBoxing {
    public static void main(String[] args) {
        int a =10;
        Integer b=Integer.valueOf(a);
        //a. wenn wir a schreiben , kommt keine Methodu , weil das primitiv.
        System.out.println((b.byteValue()));// hier b ist ein Wrapper Classes , b hat  eigene methodu
        Integer c=100;
        int d=c;  // ist gleich ... int d=c.intValue();
    }
}
