package Nested_Classes;

public class WrapperClass {
    public static void main(String[] args) {
        int a=10;
        Integer b=20;
        System.out.println((a + b));
        System.out.println((Integer.max(20, 50)));
        String c="90";
        int d=Integer.parseInt(c);
        System.out.println(d+a);
        String str=b.toString();

    }
}
