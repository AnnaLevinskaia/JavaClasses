package repls;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class repl188 {


        public static void main(String[] args) {
            Scanner num=new Scanner(System.in);
            ArrayList<Integer> num1=new ArrayList<>(5);


            for (int i = 0; i <5 ; i++) {
                int n=num.nextInt();
                num1.add(n);

            }
            //System.out.println(num1+" ");
            ListIterator<Integer> stringListIterator=num1.listIterator();
            while (stringListIterator.hasNext()){
                System.out.print(stringListIterator.next()+" ");
            }

    }
}
