package class25_Iterator_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem = new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Concealer");
        makeUpItem.add("Base");
        makeUpItem.add("Mascara");
        makeUpItem.add("EyeLinear");
        makeUpItem.add("Lipstick");

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove Soap");
        cosmetics.add("Conditioner");
        cosmetics.add("Shampoo");
        cosmetics.add("Lotion");

        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmetics);
        System.out.println(beautyProducts);

        beautyProducts.remove("Lotion"); //remove only 1 item
        System.out.println(beautyProducts);

        beautyProducts.removeAll(cosmetics); //remove all items from list cosmetics
        System.out.println(beautyProducts);

        beautyProducts.clear(); //remove everything
        System.out.println(beautyProducts);





    }
}
