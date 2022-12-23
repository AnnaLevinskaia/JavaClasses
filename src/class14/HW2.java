package class14;

//Create a method that will take a number and prints whether the number is even or odd.
public class HW2 {

void printEvenOdd (int num) {
    if(num%2==0) {
        System.out.println("Number is Even");
    } else {
        System.out.println("Number is Odd");
    }
}

    public static void main(String[] args) {
        HW2 hw2=new HW2();
        hw2.printEvenOdd(3);

    }
}
