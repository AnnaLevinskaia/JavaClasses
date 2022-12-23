package class28_Map_Exel;

import java.util.HashMap;
import java.util.Iterator;

public class MapsDemo {
    public static void main(String[] args) {

        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14", 1000.0); //double-downcasting. we work with the object, autocasting doesn't work
        items.put("Eggs", 2.4);
        items.put("Apple", 5.0);
        items.put("Keyboard", 5.0);
        items.put("Flowers", 1.8);

        //remove items with price more than 10
        //Iterator<Double>values=items.values();//return double collection
        Iterator<Double>iterator=items.values().iterator(); //than use iterator

        while (iterator.hasNext()){
            Double price=iterator.next();
            if(price>10){
                iterator.remove();
            }
        }

        //items.values().removeIf(price -> price > 10); //18-24 the same

        items.values().removeIf( //iteratoe inside removeIf
                (Double price) ->{
                    if(price>10){
                        return true;
                    } else {
                        return false;
                    }
                });


/*        public boolean check(Double price){
            if (price > 10) {
                return true;
            } else {
                return false;

            }}*/




        }



    }

