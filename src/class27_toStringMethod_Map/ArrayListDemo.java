package class27_toStringMethod_Map;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Tomy", "German", "grey"));
        dogs.add(new Dog("Jony", "BullDog", "white"));
        dogs.add(new Dog("Bobik", "BullDog", "brown"));

        //Dog dog=new Dog("Bobik", "BullDog", "brown");
        //System.out.println(dog);
        System.out.println(dogs);

        //or longer way
        ArrayList<Dog> dogs1=new ArrayList<>();
        Dog dog1=new Dog("Tima", "BullDog", "brown");
        Dog dog2=new Dog("Timur", "BullDog", "brown");
        Dog dog3=new Dog("Timuric", "BullDog", "brown");
        dogs1.add(dog1); //dog1.toString() - automatically add by java
        dogs1.add(dog2);
        dogs1.add(dog3);
        System.out.println(dogs1);
        System.out.println(dog1);




    }
}
