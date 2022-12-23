package repls;

import java.util.LinkedList;
import java.util.List;

/*Create a method that takes a list as a paramter
        removes an element if it starts with letter
        A from given List and return new List then
        in the main method print that list.*/
public class repl194RemoveElement {
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        var iter=countries.iterator();

        while (iter.hasNext()){
            String count=iter.next();
            if(count.startsWith("A")){
                iter.remove();
            }
        }

        System.out.println(countries);
    }


}
