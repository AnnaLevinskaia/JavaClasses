package repls.InterviewRepls;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Remove Consecutive duplicates
//Write the logic to remove only consecutive duplicates
public class Repl224RemoveDupl {
    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("aabbcdeyt"));
        System.out.println(removeConsecutiveDuplicates("aabbccaddda"));
    }

    public static String removeConsecutiveDuplicates(String input) {

        // Create a set to store the unique characters
        Set<Character> set = new HashSet<>();

        // Create a new string builder to store the result
        StringBuilder sb = new StringBuilder();

// Iterate through the input string
        for (char c : input.toCharArray()) {
            // If the character is not in the set, add it to the set and append it to the result string
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }

        // Convert the result string builder to a string and print it
        String output = sb.toString();
        //System.out.println(output); // prints "abcdeyt"

        return output;
    }
}
