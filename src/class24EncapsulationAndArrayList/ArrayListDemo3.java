package class24EncapsulationAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Character> chars=new ArrayList<>();
        ArrayList<Character> chars1=new ArrayList<>(new ArrayList<>(Arrays.asList('E', 'B')));
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('E');

        System.out.println(chars);
        System.out.println(chars1);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(12.5F);
        floats.add(18.5F);
        floats.add(8.5F);
        System.out.println(floats);

    }
}
