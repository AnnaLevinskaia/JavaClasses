package recap5;

public class Apple extends Fruit {

    String size;
    String taste;
    double price;

    Apple(String name, String shape, String color, String size){
        super(name, shape, color); //we must call constructor from the parent class, if parent have a constructor
        this.size=size;
    }

    Apple(String name, String shape, String color, String taste, double price){  //we cant have 4 string - it is the same signuche
        super(name, shape, color);
        this.taste=taste;
        this.price=price;
    }

    void makeJuice(){
        System.out.println("from "+name+" we can make juice");
    }
    void makeJuice(String fruit){  //name+parameters => method signature; in method overloading method signature must be different,
        System.out.println("Juice from apple mix with banana");
    }




    public static void main(String[] args) {
        Apple app=new Apple("apple", "circle", "red", "small");
        app.grow();
        System.out.println(app.name);
        System.out.println(app.price);
        System.out.println(Fruit.fresh);
        System.out.println(Apple.fresh);

        app.makeJuice();
    }

}
