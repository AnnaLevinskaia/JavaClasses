package class24EncapsulationAndArrayList;

public class Horse {
    public Horse(String name, String breed, String color, int age) {
      setName(name);
      setBreed(breed);
      setColor(color);
      setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Name can not be empty");
        }else {
            this.name = name;
        }
    }

    public String getBreed(String name) {
        if(name.equals("Josh")){
            return "Not allow";
        }else {
            return breed;
        }
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()){
            System.out.println("Breed can not be empty");
        }else {
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()) {
            System.out.println("Color can not be empty");
        }else {
            this.color = color;
        }
    }

    public int getAge() {
            return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Age can not be negative");
        }else {
            this.age = age;
        }
    }

    private String name;
    private String breed;
    private String color;
    private int age;
}
