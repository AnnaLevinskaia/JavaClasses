package recap3;

public class Dog {
    String name; //instance variable
    int weight;
    static String breed;

    void printInfo() {
        System.out.println("Dog features: " + name + ", " + weight + ", " + breed);
    }

    void love(String thing){
        System.out.println(name+" loves "+thing);
    }

    double getPrice() {
        if (weight < 5) {
            return 100;
        } else if (weight<10) {
            return 200;
        } else {
            return 1000;
        }

    }
    String bark() {
        String noise; //local variable, define inside of block of code

        if (weight < 5) {
            noise= "loud";
        } else if (weight<20){
            noise="Woof";
        } else {
            noise="Gaaav";
        } return noise;
    }
}
