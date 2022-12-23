package class25_Iterator_ArrayList;

import java.util.ArrayList;

public class HW2 {
    //Create an arrayList of drinks.
    // If any drink has letter “a” or “e” replace it with water.

    public static void main(String[] args) {
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("fresh Juice");
        drinks.add("Iced Tea");
        drinks.add("Soda");
        drinks.add("canned Juice");
        drinks.add("Milk");
        drinks.add("Chocolate Milk");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water"); //replace the element
            }
        }
        System.out.println(drinks);

    }
}
