package repls;

import java.util.LinkedList;

/*        Create a logic to calculate sum of the all the values in list.
        Print the result of sum.*/
public class repl193Sum {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);


        var iterator = num.iterator();
        int sum = 0;
        while (iterator.hasNext()) {

            var n=iterator.next();
            sum=sum+n;

        }
        System.out.println(sum);
    }
}
