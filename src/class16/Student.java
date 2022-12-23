package class16;

public class Student {

    String name;
    String id;
    static int numberOfStudent; //if we remove static, output will be 1

    public static void main(String[] args) {
        Student roman=new Student();
        roman.id="1";
        roman.name="Roman";
        roman.numberOfStudent=1;

        Student sonam=new Student();
        sonam.id="2";
        sonam.name="Sonam";
        sonam.numberOfStudent++;

       System.out.println(Student.numberOfStudent);
        System.out.println(sonam.numberOfStudent);
        System.out.println(numberOfStudent); //other possible way
    }



}
