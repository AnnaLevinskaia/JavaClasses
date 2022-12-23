package class25_Iterator_ArrayList;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        int num=10;
        Integer wrappedNum=Integer.valueOf(num);
        System.out.println(wrappedNum); //how to convert by hand-boxing or manual conversion from primitive to wrapper type
//or
        Integer wrappedNum1=num;  //AutoBoxing or automatic conversion of a primitive to a wrapper type
        System.out.println(wrappedNum);
        ArrayList<Integer> numbers=new ArrayList<>();

        int num2=wrappedNum.intValue();//unboxing converting - non primitive->primitive
  //or
        int num3=wrappedNum; //auto unboxing or automatic conversion
    }
}
