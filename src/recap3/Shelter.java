package recap3;

public class Shelter {

    public static void main(String[] args) {

        Dog.breed="Huskey";
        Dog dog1=new Dog(); //object of the class
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="Tommy";
        dog2.weight=11;
        System.out.println(dog2.name);
        dog2.printInfo();

        dog1.name="Bobik";
        dog1.breed="German"; //by mistake, it is change breed for dog2

        dog1.printInfo();
        dog2.printInfo();

        double price=dog1.getPrice();
        System.out.println(price);

        double price2=dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());

        dog1.love("to jump");
        dog2.love("to play");


        }



    }


