package repls;

import java.util.TreeMap;

public class repl204Map {
    public static void main(String[] args) {
        TreeMap<String,String> objects=new TreeMap<>();

        objects.put("Street","Patrick ST");

        objects.put("Suite","265");

        objects.put("City","Vienna");

        objects.put("Zip","22180");

        objects.put("Country","United State");

        var iterator=objects.values().iterator();

        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println(objects);
    }
}
