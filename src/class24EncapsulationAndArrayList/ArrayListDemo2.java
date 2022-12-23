package class24EncapsulationAndArrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<Integer>(); //we can not use primitive data type in collection framework
//int->integer, boolean->Boolean - it is a class, that can store this data type

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        int a=34;
        numbers.add(a);
        System.out.println(numbers);

        for(Integer num:numbers){
            System.out.println(num);
        }

    }
}
