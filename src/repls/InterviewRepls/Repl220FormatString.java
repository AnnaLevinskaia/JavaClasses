package repls.InterviewRepls;

import java.util.ArrayList;
import java.util.List;

public class Repl220FormatString {
/*    Format the String:
    Write the logic to format the string in the below given format
    xxx-xxx-xxx
    after each 3 digits ther should be dash("-")
    if there are any spaces in the input remove those*/
        public static void main(String[] args) {

            System.out.println(formatString("00-11   22 33"));
            System.out.println(formatString("444-555-666"));
            System.out.println(formatString("00-44  #$% 48 55"));
        }

        public static String formatString(String input){

            String deleteSpace = input.replaceAll(" ", "");
            String deleteSym = deleteSpace.replaceAll("[#$%!@%^&*-]", "");
            StringBuilder sb = new StringBuilder(deleteSym);

            for (int i = 3; i < sb.length(); i=i+4) {
                sb.insert(i, "-");
            }
            return sb.toString();
        }
}
