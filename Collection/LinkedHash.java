package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHash {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();

        lset.add(10);
        lset.add(20);
        lset.add(30);
        lset.add(10);
        lset.add(10);

        Iterator<Integer> itr=lset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
