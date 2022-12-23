package class28_Map_Exel;

import java.util.HashMap;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0); //double-downcasting. we work with the object, autocasting doesn't work
        items.put("Eggs", 2.4);
        items.put("Apple", 5.0);
        items.put("Keyboard", 5.0);
        items.put("Flowers", 1.8);

        for (Double value:items.values()
             ) {
            System.out.println(value);
        }








    }
}
