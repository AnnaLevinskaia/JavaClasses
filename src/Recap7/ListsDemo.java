package Recap7;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Dog"); //automatically add in the end of the list when we use simple add method
        animals.add(0, "Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");
        animals.add("Dinosaur");
        animals.add("Rat");

        System.out.println(animals);

        //print the size of each word
        for (String animal : animals) {
            System.out.println(animal.length());
        }

        //remove words which have more than 6 letters
        animals.removeIf(x->x.length()>5);
        System.out.println(animals);

        //elements more than 2 - replace with Camel
        // we don't need to use iterator because we are not performing any operation that can change the size of the list
        //not an enhanced fot loop - we are not printing the data, we're updating the data
        //as we need the index to update the data we should use simple for loop

        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i).length()>3){
                animals.set(i,"Camel");
            }
        }
        System.out.println(animals);


        System.out.println(animals.subList(0,3));
        ListIterator<String> stringListIterator=animals.listIterator();
        while (stringListIterator.hasNext()){
            System.out.print(stringListIterator.next()+" ");
        }
    }
}
