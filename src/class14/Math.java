package class14;

public class Math {

void add(int num1, int num2) {
    System.out.println(num1+num2);
}
    void printSecondTime(int size) {
        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for (int i=0; i<size;i++) {
            nextNum=previous+currentNumber;
            System.out.println(nextNum);
            previous=currentNumber;
            currentNumber=nextNum;
            //System.out.println("------");
        }
    }

    public static void main(String[] args) {
        Math obj=new Math(); //creating an object of the Math class
    obj.printSecondTime(5); //call the method
        System.out.println("-----------");

    obj.printSecondTime(8);
        System.out.println("------");
    obj.add(10,20);

    }









}
