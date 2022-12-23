package recap4This;

public class School {
    public static void main(String[] args) {
        Teacher t=new Teacher("John", "Smith");
        System.out.println(t.name);

        Teacher t1=new Teacher("John", "Travolta", "Biology");
        t1.teach();
        Teacher t2=new Teacher("Bob", "Hell", 2);

        Teacher.school="Syntax";
        Teacher.work(); //static method = class name.method name();

        t2.print();
        t2.teach();
        //t2.getBonus(); private

    }

}
