package repls;

public class MethodOverloading {

    int number;
    String school;
    double num;

//    MethodOverloading() {
//
//    }
//
//    MethodOverloading(double num) {
//        this.num = num;
//    }
//
//    MethodOverloading(int number) {
//        this.number = number;
//    }

    void F1(int number){
        System.out.println(number);
    }
    void F1(double num){
        System.out.println(num);
    }
    void F1(String school){
        System.out.println(school);
    }
    public static void main(String[] args) {
        MethodOverloading md=new MethodOverloading();
        md.F1(100);
        md.F1(100.05);
        md.F1("Syntax");
    }
}
