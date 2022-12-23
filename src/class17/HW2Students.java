package class17;

//Write a java Class Students that have a constructor which takes students name and 3 subject grades.
// Inside your class also have a method to Calculate Average Grade. Test.xlsx Student class for 5 different students with different marks.
// Your program should print an average mark of each students name.
//NOTE: please use different names for instance and local variables.
public class HW2Students {

    public String name;
    int mathGrade;
    int literGrade;
    int historyGrade;

    public void averageMethod() {
        int averageGrade = (mathGrade + literGrade + historyGrade) / 3;
        System.out.println(averageGrade+" "+ name);
    }
    public HW2Students(String studentName, int studentMathGrade, int studentLiterGrade, int studentHistoryGrade){
        name=studentName;
        mathGrade=studentMathGrade;
        literGrade=studentLiterGrade;
        historyGrade=studentHistoryGrade;

    }

    public static void main(String[] args) {
        HW2Students bob = new HW2Students("Bob", 80, 75, 85);
        bob.averageMethod();

        HW2Students tom = new HW2Students("Tom", 50, 75, 75);
        tom.averageMethod();

        HW2Students john = new HW2Students("John", 80, 75, 65);
        john.averageMethod();
    }


}
