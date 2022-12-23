



public class HW2 {
    public static void main(String[] args) {
        //Create a String that should be combination of letters, numbers and special characters.
        // Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String sent="abcdABCD1234@#$%";

        sent=sent.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("sent = " + sent);
        System.out.println(sent.length()+" alphanumeric (abd AZ 284) characters are there in the String");



    }
}
