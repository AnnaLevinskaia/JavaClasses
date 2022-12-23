package repls;

public class superKeyword {

        public static void main(String[] args) {
            Child child=new Child();
           // child.parentPrint1();
        }
    }

    class Parent{

        Parent(){
            System.out.println("Parent Constructor without argument");
        }

//        void parentPrint1(){
//            System.out.println("Parent Constructor without argument");
//        }

        int num;
        Parent(int num){
            this.num=num;
        }
        void parentPrint2(){
            System.out.println(num);
        }
    }

    class Child extends Parent{
        Child(){

        }
        void childPrint1(){
            System.out.println("Parent Constructor without argument");
        }
        int numm;
        Child(int num, int numm){
            super(num);
            this.numm=numm;
        }

    }
