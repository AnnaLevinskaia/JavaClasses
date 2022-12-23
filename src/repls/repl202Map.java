package repls;

import java.util.Map;
import java.util.TreeMap;

public class repl202Map {
    public static void main(String[] args) {


        TreeMap<String,String> objects=new TreeMap<>();
        objects.put("1 item", "apple");
        objects.put("2 item", "banana");
        objects.put("3 item", "pear");
        objects.put("4 item", "tomato");
        objects.put("5 item", "mango");
        objects.put("6 item", "kiwi");

        var entrySet=objects.entrySet();

        for (Map.Entry<String, String> entry:entrySet
        ) {
            //System.out.println(entry);
            System.out.println("Key is "+entry.getKey()+" and value is "+entry.getValue());
            //System.out.println(entry.getValue().toUpperCase());
        }

        objects.remove("2 item");
        System.out.println(objects);

    }
}
