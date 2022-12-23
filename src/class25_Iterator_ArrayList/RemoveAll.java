package class25_Iterator_ArrayList;

import java.util.ArrayList;

public class RemoveAll {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Concealer");
        makeUpItem.add("Base");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLinear");
        makeUpItem.add("Lipstick");


        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Concealer");
        makeUpItem.removeAll(itemsToBeRemoved);
        System.out.println(makeUpItem);


    }
}
