package class19;

public class Animal {  //parents class
    String name;
    String breed;
    String color;

    public Animal(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void printInfo() {
        System.out.println(name + ", " + breed + ", " + color);
    }
}
class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Jacky", "German", "Green");
        dog.printInfo();
    }
}
