package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collections2 {
    public static void main(String[] args) {
        ArrayList<Integer> unsereIntegerArrayList=new ArrayList<Integer>();
        Collections.addAll(unsereIntegerArrayList,1,23,4,6,7,8);
        System.out.println(unsereIntegerArrayList);
        unsereIntegerArrayList.remove(2);//delete
        System.out.println(unsereIntegerArrayList);
        unsereIntegerArrayList.remove((Integer)4);//delete
       Collections.addAll(unsereIntegerArrayList,3,4,5,6);//mehrere inhalt hinfügen..
        System.out.println(unsereIntegerArrayList);
       Collections.addAll(unsereIntegerArrayList,3,4,5,6);
        System.out.println(unsereIntegerArrayList);
        while (unsereIntegerArrayList.contains((Integer)4)){
    unsereIntegerArrayList.remove((Integer) 4);
            System.out.println(unsereIntegerArrayList);
        }
        System.out.println("**********************");
        Collections.shuffle(unsereIntegerArrayList);//beliebig reihenfolge
        System.out.println(unsereIntegerArrayList);
        Collections.sort(unsereIntegerArrayList);//sortieren
        System.out.println(unsereIntegerArrayList);
    }
}
