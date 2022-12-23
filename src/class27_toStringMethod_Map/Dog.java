package class27_toStringMethod_Map;

public class Dog {
    private String name;
    private String breed;
    private String color;

    public Dog(String name, String breed, String color) {
        setName(name);
        setBreed(breed);
        setColor(color);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String toString(){ //we override the method from Object class and if we try to print object
                              //we will be print what we put here
                              //better practice to use this method, instead of create printInfo..
        //return "Dog123";
        return name+" "+breed+" "+color;
    }

}
