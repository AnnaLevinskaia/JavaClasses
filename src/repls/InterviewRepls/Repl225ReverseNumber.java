package repls.InterviewRepls;

public class Repl225ReverseNumber {

    public static void main(String[] args) {
        int N=123;
        reverseInteger(N);
    }
    public  static int reverseInteger(int N){

        StringBuilder str=new StringBuilder(N);
        str.append(N);
        System.out.println(str.reverse());
        return N;
    }
}
