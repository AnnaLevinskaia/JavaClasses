package class17;

//Write a java class that will have a constructor: one with parameters and second without any parameters.
// Create a separate Test.xlsx class where you will execute both of the constructors 1 by 1.
public class HW1Teacher {

    String name;
    String occupation;
    int yearsExperience;
    String hobby;

    public HW1Teacher(String teacName, String teacOccupation, int teacYearsExperience, String teacHobby){
        name=teacName;
        occupation=teacOccupation;
        yearsExperience=teacYearsExperience;
        hobby=teacHobby;
        System.out.println(name+" "+occupation);
    }

    public HW1Teacher(){
        System.out.println("no parameters here");
    }

    public static void main(String[] args) {

    }
}
