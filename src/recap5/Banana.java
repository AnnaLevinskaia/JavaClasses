package recap5;

public class Banana extends Fruit {  //hierercial

    String origin;


    public Banana(String name, String shape, String color, String origin) {
        super(name, shape, color); //accessible to all methods and variables
        this.origin=origin;
    }

    void makeSmothie(){
        System.out.println(name+" is a base for smothie");
    }

    //method overriding - we have 2 method with same name but inside
    //different classes. Method signature must be same. Return type must be same.
    //Access modifier must be same or hiegher
    public void grow(){
        System.out.println(name+" grows fast");
    }

    //when child class have same static method as parent class
    //we cant achieving overriding. This is hiding method
    public static void havePeel(){
        System.out.println("Banana is easy to peel");
    }

    void makePie(){
        System.out.println("Banana pie is delicious");
    }

    public static void main(String[] args) {
        Banana ban=new Banana("Banana", "banana shape", "yellow", "Ecuador");
        ban.makeSmothie();
        ban.grow();
        System.out.println(ban.origin);
        ban.grow();
        havePeel();

        //runtime polimorphisme

        Fruit fruit=new Banana("banana", "banana shape", "green", "Africa");
        fruit.grow();
        fruit.benefits();
        fruit.havePeel();  //static method cant be overriding - from parent. static belongs to the parent class always




    }
}
