package class26_LinkedList_Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class WhenToUseSets {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);
        numbers.add(60);
        numbers.add(10);
        numbers.add(60);
        System.out.println(numbers);


        System.out.println(new LinkedHashSet<>(numbers)); //convert ArrayList to LinkedHashSet


        HashSet<Integer> hashSet=new HashSet<>(numbers); //convert ArrayList to hashSet
        System.out.println(hashSet);

        LinkedList<Integer> linkedList=new LinkedList<>(hashSet); //convert hashSet to LinkedList
        System.out.println(linkedList);
    }
}
