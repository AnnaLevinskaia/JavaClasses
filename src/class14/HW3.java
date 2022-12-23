package class14;

//Create a method that will print whether given String is palindrome or not.
public class HW3 {

void printPalindrome(String str) {
str=str.toLowerCase();
    StringBuilder stringBuilder= new StringBuilder(str);
    stringBuilder.reverse();
    if (stringBuilder.toString().equals(str)) {
        System.out.println("The string is palindrome");
    } else {
        System.out.println("The string is not palindrome");
    }
}


    public static void main(String[] args) {
HW3 task=new HW3();
task.printPalindrome("mam");
    }
}

