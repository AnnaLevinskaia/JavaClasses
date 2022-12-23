package class28_Map_Exel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0); //double-downcasting. we work with the object, autocasting doesn't work
        items.put("Eggs", 2.4);
        items.put("Apple", 5.0);
        items.put("Keyboard", 5.0);
        items.put("Flowers", 1.8);

        Set<String> keys = items.keySet();//keySet method return a set that contains all the keys of a map
       //or the same Collection<String> keys=items.keySet(); Collection is a parent interface
        for (String key:keys
             ) {
            System.out.println(key);
        }

        Collection<Double> values=items.values();
        for(Double v:values){
            System.out.println(v);
        }



    }
}
