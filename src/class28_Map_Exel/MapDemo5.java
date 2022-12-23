package class28_Map_Exel;

import java.util.HashMap;
import java.util.Map;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0); //double-downcasting. we work with the object, autocasting doesn't work
        items.put("Eggs", 2.4);
        items.put("Apple", 5.0);
        items.put("Keyboard", 5.0);
        items.put("Flowers", 1.8);

        //Set< Map.Entry<String, Double>> entrySet=items.entrySet();  OR
        var entrySet=items.entrySet();
        System.out.println(entrySet);


        for (Map.Entry<String, Double> entry:entrySet
             ) {
            //System.out.println(entry);
            System.out.println(entry.getKey()+" "+entry.getValue());
        }






    }
}
