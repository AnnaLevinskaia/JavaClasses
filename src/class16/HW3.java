package class16;

public class HW3 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared and executed by calling it is name.

private static char vowels(String str) {
    char c = 0;
    for (int i = 0; i < str.length(); i++) {
        c = str.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {

            System.out.print(c);
        }
    }
    return c;
}
    public static void main(String[] args) {
       // HW3 obj=new HW3(); because we have static in line 7
        System.out.println(vowels("Hello word!"));
    }

}



