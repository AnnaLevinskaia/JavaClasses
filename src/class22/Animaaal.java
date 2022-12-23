package class22;

public class Animaaal {
    void eat(){
        System.out.println("Animals usually eat plants");
    }
    void sleep(){
        System.out.println("Animals sleep for 8 to 10 hours");
    }
}

    class Panda extends Animaaal {
    @Override
    void eat(){
        System.out.println("Pandas eat bamboos");
    }

    @Override
    void sleep(){
        System.out.println("Pandas sleep for 14 hours");
    }

    void puk(){
        System.out.println("puuuk");
    }
}

class Cat extends Animaaal {
    void eat(){
        System.out.println("Cats eat fish");
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();

        Panda panda=new Panda();
        panda.puk();

        Animaaal animaaal=new Panda();//upcasting
        //Panda panda=new Animaaal();- down-casting, it is not allowed

        Animaaal animaaal1=new Cat();
        Animaaal [] animaaals={new Cat(), new Panda()};

    }
}
