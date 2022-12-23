package class27_toStringMethod_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99); // to Store the values in a map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        Set<String> allKeys=fruit.keySet(); // getting all the  keys in the form of a set
       //Collection<String> allKeys=fruit.keySet(); // possible to use Collection also, because it is a parent of arraylist, linked list, sets.. everything inside the collection framework
        System.out.println(allKeys);

        Iterator<String> iterator= allKeys.iterator(); // Getting an iterator on that  set
        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.contains("n")){
                iterator.remove();
            }
        }

       //or  fruit.keySet().removeIf(x->x.contains("n")); instead of line 15-23
        System.out.println(fruit);









    }
}
