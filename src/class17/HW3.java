package class17;

//Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
// and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class
// inside different package  and observe result.
public class HW3 {

    String name;
    String lastName;
    int age;
    String adress;

    public HW3(String name1, String lastName1, int age1, String adress1) {
        name = name1;
        lastName = lastName1;
        age = age1;
        adress = adress1;
    }

    HW3(String name1, String lastName1, int age1) {
        name = name1;
        lastName = lastName1;
        age = age1;
    }
    private HW3(String name1, String lastName1) {
        name = name1;
        lastName = lastName1;
    }
    protected HW3(String name1) {
        name = name1;
    }



    public static void main(String[] args) {
        new HW3("Anna");
        new HW3("Elena", "Precrasnaia");
    }
}
