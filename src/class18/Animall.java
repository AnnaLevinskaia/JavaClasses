package class18;

public abstract class Animall {
    String name;
    String breed;
    int age;
    double weight;


    void printInfo(){ //we cant enharitate the constructor
        String name="now this will be printed";
        System.out.println("name "+this.name+" Breed "+breed+" age "+age+" Weight "+weight);
    }

    abstract void sleep();
}
