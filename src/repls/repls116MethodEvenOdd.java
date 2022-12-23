package repls;

public class repls116MethodEvenOdd {

    void method(int first, int second){
        boolean boo = false;
        if(first%2==0 || second%2==0){

            System.out.println(boo);
        } else if(first%2!=0 || second%2!=0) {
            System.out.println(boo);
        }
    }
    public static void main(String[] args) {
        repls116MethodEvenOdd obj=new repls116MethodEvenOdd();
        obj.method(4,4);

    }
}
