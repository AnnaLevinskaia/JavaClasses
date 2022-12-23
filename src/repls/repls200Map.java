package repls;

import java.util.Collection;
import java.util.LinkedHashMap;

public class repls200Map {
    public static void main(String[] args) {

        LinkedHashMap<String,String> objects=new LinkedHashMap<>();
        objects.put("Street", "Patrick ST");
        objects.put("Suite", "265");
        objects.put("City", "Vienna");
        objects.put("Zip", "22180");
        objects.put("Country", "United State");


        Collection<String> values = objects.values();
        System.out.println(values);

        for (var val:values
             ) {
            System.out.println(val);
        }

        System.out.println(objects.size());
        objects.clear();
        System.out.println(objects);

    }
}
