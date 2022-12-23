package Recap7;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Josh", "Platin", "123"));
        students.add(new Student("Adam", "Park", "123"));

        System.out.println(students);

        for (Student student : students) {
            student.printInfo();
        }

        Student student=new Student("Josh", "Platin", "123");
        System.out.println(students.contains(student)); //it will be work properly if we override equals methods
        System.out.println(student);
        System.out.println(students);

    }
}
