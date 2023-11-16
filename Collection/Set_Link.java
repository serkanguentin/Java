package Collection;

import java.util.*;
import java.util.Collections;

public class Set_Link {
    public static void main(String[] args) {
        String[] myTestArray=new String[]{"rot","blau","grün","gelb"};
        HashSet<String > unserFarbenHashSet=new HashSet<String>(List.of(myTestArray));
        System.out.println(unserFarbenHashSet);
        unserFarbenHashSet.add("Rosa");
        unserFarbenHashSet.add("Rosa");//kann man nicht etwas hingezufügt werden
        unserFarbenHashSet.add("Rosa");//kann man nicht etwas hingezufügt werden
        System.out.println(unserFarbenHashSet);
        System.out.println(unserFarbenHashSet.size());

        HashMap<Integer, String> myHashMap=new HashMap<>();
        for (int i = 0; i < 10; i++) {
            myHashMap.put(i,"String "+i);
        }
        System.out.println(myHashMap);

        HashMap<String, String> myHashStringMap=new HashMap<>();
        for (int i = 0; i < 10; i++) {
           myHashStringMap.put(("key : "+i),("String "+i));
        }
        System.out.println(myHashStringMap);
        for (Integer ikeys:
             myHashMap.keySet()) {
            System.out.println(ikeys);
        }
        for (String sValues:
                myHashStringMap.values()) {
            System.out.println(sValues);
        }
    }
}
