package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer> myIntHashSet=new HashSet<Integer>();
        System.out.println("************* hashSet **************");
        myIntHashSet.add(3);
        myIntHashSet.add(4);
        myIntHashSet.add(5);
        myIntHashSet.add(6);
        myIntHashSet.add(7);
        myIntHashSet.add(60);
        myIntHashSet.add(3);//wiederholende wer kannn nicht hingezufügt werden
        System.out.println(myIntHashSet);
        for (Integer i:
             myIntHashSet) {
            System.out.println(i);

        }
        System.out.println(myIntHashSet.size());
        System.out.println(myIntHashSet.contains(1));// enhalten
        System.out.println("********** Iterator ********");
        Iterator<Integer> itr=myIntHashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
