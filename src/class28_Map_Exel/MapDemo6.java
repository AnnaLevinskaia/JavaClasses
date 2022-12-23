package class28_Map_Exel;

import java.util.HashMap;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0); //double-downcasting. we work with the object, autocasting doesn't work
        items.put("Eggs", 2.4);
        items.put("Apple", 5.0);
        items.put("Keyboard", 5.0);
        items.put("Flowers", 1.8);

        var iterator=items.entrySet().iterator();
        while (iterator.hasNext()){
            var item=iterator.next(); //gets the item
            String key=item.getKey();
            var value=item.getValue();
            if(key.contains("e") && value>10){
                 iterator.remove();
            }
        }
        System.out.println(items);


        //or lambda
        items.entrySet().removeIf(entr -> entr.getKey().contains("e")&&entr.getValue()>10);
        System.out.println(items);

    }
}
