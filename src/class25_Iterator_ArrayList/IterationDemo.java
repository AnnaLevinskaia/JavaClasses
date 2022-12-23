package class25_Iterator_ArrayList;
import java.util.ArrayList;
import java.util.Iterator;

public class IterationDemo {
    public static void main(String[] args) {

        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("concealer");
        beautyProducts.add("Mascara");
        beautyProducts.add("Primer");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("eyeLinear");

/*        for (int i = 0; i < beautyProducts.size(); i++) {
            if(beautyProducts.get(i).endsWith("r")){
                beautyProducts.remove(i);
            }
        }  //better to do not use loops with ArrayList, when we want to add or remove size
        System.out.println(beautyProducts);*/

        //better approach to use iterator

        Iterator<String> iterator=beautyProducts.iterator();
        System.out.println(iterator.hasNext()); //if we have another item we get true
        System.out.println("------------");
        System.out.println(iterator.next()); //give the item and remove it from iteration

        System.out.println(iterator.hasNext());

        iterator.next();
        iterator.next();
        System.out.println(iterator.next());

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
