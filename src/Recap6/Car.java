package Recap6;

interface Drivable{

    //by default all variables public static final
    boolean DRIVES=true;

    //we can not have a constractor, we don't have instant variables

    void breaks(); //public abstract by default all method
}

interface Vehicle{
    void haveMotor(); //abstract method

    default void haveBreak(){ //we can have implemented method with help of default keyword and static
        System.out.println("All vehicle have break");
    }

    static void honk(){  //it ia not for overriding, all child will have it
        System.out.println("All vehicle honk");
    }

}


//wiyh heilp of abstract class we can achieve 0-100% abstraction
public abstract class Car {
    String color, make, model;
    public static final int WHEELS=4;

    public Car(String make, String model, String color) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    void drive(){
        System.out.println("All cars can drive");
    }

    abstract void start();

    abstract void stop();
}

class Tesla extends Car implements Drivable, Vehicle{  //to add abstract to this class or provide implementation to abstract method
                                              //multiple inheritance
    public Tesla(String make, String model, String color) {
        super(make, model, color);
    }

    @Override
   public void start() {
        System.out.println(make+" start automatically");

    }

    @Override
   public void stop() {
        System.out.println(make+" stop by press button");

    }

    public void charge(){
        System.out.println("You need to charge Tesla");
    }

    @Override
    public void breaks() {
        System.out.println(make+" can break");
    }

    @Override
    public void haveMotor() {
        System.out.println(make+" have motor");
    }

    public void haveBreak(){

    }

}





