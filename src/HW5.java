public class HW5 {
    //How would you check if String is palindrome or not? aba=> true
    //Abbc =>false
    public static void main(String[] args) {

        String a="anna";
        char[] sent=a.toCharArray();
        String reverse="";

        for(int i=sent.length-1; i>=0; i--) {
            reverse+=sent[i];
        }
        System.out.println(reverse.equals(a));

        System.out.println("------------");
        //techers way
        String str="dad dad dad";
        StringBuilder stringBuilder= new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)) {
            System.out.println("The string is palindrome");
        } else {
            System.out.println("The string is not palindrome");
        }





    }
}
