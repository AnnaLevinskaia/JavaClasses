package repls;

import java.util.LinkedList;
/*Create a Linked List that will store Integer Objects from 50-100.
Once Linked List is created remove all numbers that are not divisible by 3.
Print Linked List*/
public class Repl189 {


    public static void main(String[] args) {

        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }
        var it=numbers.iterator();
        while (it.hasNext()){
            Integer num=it.next();
            if(num%3!=0){
                it.remove();
            }
        }
        System.out.println(numbers);


    }
}
