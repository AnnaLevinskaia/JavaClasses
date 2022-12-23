package class24EncapsulationAndArrayList;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Bob");
        names.add("Luba");
        names.add("Tymur");
        names.add("Salma");
        names.add(0,"Josh");
        System.out.println(names);
        names.add(1,"Evgenii"); //add new names
        names.set(0, "Anna"); //replace
        System.out.println(names);

        names.clear(); //remove all
        System.out.println(names);



    }
}
