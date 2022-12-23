package repls;

import java.util.ArrayList;
import java.util.Iterator;

public class Repl191 {
    public static void main(String[] args) {
        ArrayList<Boolean> listA=new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean>listB=new ArrayList<>();
        listB.addAll(listA);

        Iterator itr=listB.iterator();
        while (itr.hasNext()){
            var boo=itr.next();
            System.out.print(boo);
            System.out.println();
        }


    }
}
