package class14;

public class MethodsDemo1 {

   //a method that does not take any paramert and print some lines on the console
    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
            }

            //a method that takes a single parameter of type String and print it
            void printWord(String word) {
                System.out.println(word);
            }

    public static void main(String[] args) {

        MethodsDemo1 obj=new MethodsDemo1();
        obj.printHello();
        obj.printWord("Dont worry");
        obj.printWord("Dont worryyyyy"); //danimic method



    }









}
