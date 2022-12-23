package repls.InterviewRepls;

public class Repl226ReverseString {
    public static void main(String[] args) {

        String strToRev="I am a java Programmer";
        System.out.println(reverse(strToRev));
    }
    public static String reverse(String strToRev){

        String reverse=" ";
        String[] word=strToRev.split(" ");
        for(int j=word.length-1; j>=0; j--){
            String words=word[j];
            reverse+=words+" ";
        }
        return reverse;
    }
}
