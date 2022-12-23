package recap3;

public class Teacher {

    String name, lastName;  //instance variable
    int experience;
    String subject;
    double salary;

    static String school;

    //when we do not create a constructor-
    //compiler create a default constructor for us (void method)
   //using below constructor we initialize instance variable(name, lastName)

    Teacher(String fname, String lName){   //local variables
      name=fname;
      lastName=lName;

      //when we create a constructor compiler is not
        //doing to create a deafult constructor
    }

void print(){
    System.out.println(name+" "+lastName);
}


}
