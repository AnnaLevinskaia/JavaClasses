package class19;
//Write a Java program called Teacher.  Identify features and behaviour of that Class. Create 3 subclasses MathTeacher,
// ChemistryTeacher and PianoTeacher that would have it their own features and behaviour. Test.xlsx all 4 classes
public class HW3Teacher {
    String name;
    String lastName;
    int age;

    public HW3Teacher(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
    void canTeach(){
        System.out.println("Teacher "+name+" "+lastName+"is the best");
    }
}
  class MathTeacher extends HW3Teacher {
      MathTeacher(String name, String lastName, int age) {
          super(name, lastName, age);
      }
  }
      class ChemistryTeacher extends HW3Teacher {
          ChemistryTeacher(String name, String lastName, int age) {
              super(name, lastName, age);
          }
      }

      class PianoTeacher extends HW3Teacher {

          public PianoTeacher(String name, String lastName, int age) {
              super(name, lastName, age);
          }
      }

      class TestT {
          public static void main(String[] args) {
              new MathTeacher("Bob", "Hell", 35).canTeach();
              new ChemistryTeacher("Ivan", "Ivanov", 44).canTeach();
              new PianoTeacher("Kamilla", "Ka", 25).canTeach();
          }
      }
