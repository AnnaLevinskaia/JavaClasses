package recap9;

public class ExeptionDemo1 {
    public static void main(String[] args) {
        int age=15;

        if(age<18){
            throw new NullPointerException("Only adults are allowed");
            //throw new RuntimeException("Only adults are allowed");
        }
    }
}
