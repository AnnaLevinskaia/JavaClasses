package repls;

import java.util.LinkedList;

public class repl190Fibbon {
    public static void main(String[] args) {
        LinkedList<Integer> fibonacci=new LinkedList<>();

        int a=0;
        int b=1;

        for(int i=0; i<=10; i++){
            fibonacci.add(a);
            int c=a+b;
            a=b;
            b=c;
        }
        for(int i=0; i<10; i++) {
            System.out.print(fibonacci.get(i) + " ");
        }
    }
}
