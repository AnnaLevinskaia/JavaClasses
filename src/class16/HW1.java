package class16;

//Create a method that will accept an array as parameters and will return a sum of all elements from that array.
// Method should be visibly only within same package and accessible by the creating an instance of the class.

public class HW1 {

    int arraySum(int[] array) {
        int sum=0;
        for (int num:array) {
            sum=sum+num;
        }

        return sum;
    }

    //public static void main(String[] args) {
    //    HW1 obj=new HW1();
     //   int[] array={1,2,3,4,5};
     //   System.out.println(obj.arraySum(array));
    //}  create class HW1Test




}
