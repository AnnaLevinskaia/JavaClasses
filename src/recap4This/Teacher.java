package recap4This;

public class Teacher {

    String name, lname;
    String subject;
    int experience;
    double salary;

    static String school;

    public Teacher(String name, String lname) { //initialize instance variable, call other constructor, void method to provide action
        this.name = name;
        this.lname = lname;
    }

    public Teacher(String name, String lname, String subject) {
        this (name, lname);  //super use when we use inheritance. This is all in the same class
        this.subject = subject;

    }

    public Teacher(String name, String lname, int experience) {
        this (name, lname);
        this.experience = experience;
    }

    //static method works only with static variables and inside we can call only static method
    public static void work(){ //static method=dont need to crest object - Techer.work();

        System.out.println("All teachers work at "+school);
    }

    protected void print(){
        work();
        System.out.println("Teacher name "+name+" "+lname+" "+school);
    }

    void teach(){
        this.print(); //calling method from this current class. It is not necessary to add This.
        System.out.println(name+" teach "+subject);
    }

   private double getBonus(){
        if(experience<5){
            return 3;
             } else{
            return 3.5;
        }
    }

}
