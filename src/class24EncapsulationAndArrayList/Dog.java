package class24EncapsulationAndArrayList;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private double weight;

    public Dog(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }

    void setName(String name){ //more clear than put this code inside a constructor
        if(name.length()>30){
            System.out.println("Name can not be more than 30 letters");
        }else if(name.isEmpty()){
            System.out.println("Name can not be empty, please try again");
        }else{
            this.name = name;
        }
    }

    void setBreed(String breed){
        if(breed.length()>20){
            System.out.println("Breed can not be more than 20 letters");
        }else if(breed.isEmpty()){
            System.out.println("Breed can not be empty, please try again");
        }else{
            this.breed = breed;
        }
    }

    void setAge(int age){
        if(age>20){
            System.out.println("Wrong age, please write it again");
        }else if(age<0){
            System.out.println("Age can not be negative");
        }else{
            this.age=age;
        }
    }

    void setWeight(double weight){
        if(weight>300){
            System.out.println("Wrong weight, please write it again");
        }else if(weight<0){
            System.out.println("Negative weight is not allowed. Please try again");
        }else{
            this.weight = weight;
        }
    }
    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Age "+age+" Weight "+weight);
    }
    String getName(){
        return name;
    }
    String getBreed(){
        return breed;
    }
    int getAge(){
        return age;
    }
    double getWeight(){
        return weight;
    }
}
class Test{
    public static void main(String[] args) {
        //Dog tommy=new Dog(); //we need to pass the parameters
        //tommy.name="Tommy"; //to initialise the fields - the best way use constractors
        //tommy.weight=20;
        Dog tommy=new Dog("Tommy", "German", 15, 20); //easy to pass any value to fields, without condition
        //tommy.age=1500; //that's can be, we need access modifier and encapsulation - make it private
        tommy.printInfo();
        //System.out.println(tommy.name); it is not working
        System.out.println(tommy.getName()); //to print name

    }


}