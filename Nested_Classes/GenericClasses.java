package Nested_Classes;

public class GenericClasses <T> {

 private final T value;
 GenericClasses(T value){
     this.value=value;

 }
public  T getValue(){
     return this.value;
}
public boolean isNull(){
    return  this.getValue()==null;
}
public  void run(){
    if (isNull()){
        System.out.println("Das ist null ");
    }
    else System.out.println("diese ist  "+this.value);
}








}
