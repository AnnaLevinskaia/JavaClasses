package class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;

    Bird(String name, String color, int age, double weight){
        this.name=name;
        this.age=age;
        this.color=color;
        this.weight=weight;
    }

    void printInfo(){
        System.out.println(name+", "+color+", "+age+", "+weight);
    }
}

class Parrot extends Bird{
    Parrot(String name, String color, int age, double weight){
        super(name, color, age, weight);
     /*   this.name=name;
        this.age=age;
        this.color=color;
        this.weight=weight;*/
    }
}

class Crow extends Bird{
    boolean isClever;
    Crow(String name, String color, int age, double weight){
        super(name, color, age, weight);
       /* this.name=name;
        this.age=age;
        this.color=color;
        this.weight=weight;*/
        this.isClever=isClever;
    }
}

class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("zeki", "Green", 2,1);
        parrot.printInfo();

       Crow crow=new Crow("crow", "black", 3,1.5);
        crow.printInfo();
    }
}