package class26_LinkedList_Sets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        //or var words=new ArrayList<>();
        List<String> words2=new ArrayList<>(); //we can have all benefits of polymorphism, but
        //we can only call the method
        words2=new ArrayList<>();


        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.addFirst("Hi");



    }
}
