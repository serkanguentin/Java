package Collection;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        String[][] derNameDesStringArrays=new String[5][10];


        ArrayList<String> programmiersprachen =new ArrayList<String>();

        programmiersprachen.add("Java");
        programmiersprachen.add("C");
        programmiersprachen.add("C++");
        programmiersprachen.add("C#");
        System.out.println(programmiersprachen.size());
        programmiersprachen.add("Javascript");
        System.out.println(programmiersprachen);
        programmiersprachen.add(4,"Serkan");
        System.out.println(programmiersprachen.get(4));
        System.out.println(programmiersprachen);
        programmiersprachen.add(0,"Phyton");
        System.out.println(programmiersprachen);
        System.out.println(programmiersprachen.get(2));
        programmiersprachen.set(2,"Php");
        System.out.println(programmiersprachen);
        System.out.println(programmiersprachen);
        System.out.println(programmiersprachen.indexOf("C#"));
        System.out.println("Contains of \"C\" "+programmiersprachen.contains("C#"));
        for (int i = 0; i < programmiersprachen.size(); i++) {
            System.out.println("Index : "+ i + "=>"+programmiersprachen.get(i));

        }
        programmiersprachen.remove(programmiersprachen.get(5));
        System.out.println(programmiersprachen);
        ArrayList<Integer> unsereIntegerArrayList=new ArrayList<Integer>();
        java.util.Collections.addAll(unsereIntegerArrayList,1,23,4,6,7,8);
        System.out.println(unsereIntegerArrayList);
        unsereIntegerArrayList.remove(2);//delete
        System.out.println(unsereIntegerArrayList);
        unsereIntegerArrayList.remove((Integer)4);//delete


    }
}
