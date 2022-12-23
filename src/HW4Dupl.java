import java.util.Arrays;

public class HW4Dupl {
    public static void main(String[] args) {
//   // How would you reverse a String word by word? for example
//    // input=>This is sentence i want to reverse
//    // output=>sihT si ecnetnes i tnaw ot esrever

        String a = "This is sentence i want to reverse";
        char[] sent=a.toCharArray();

        for (int i = 0; i < sent.length; i++) {
            for (int j = sent[i] - 1; j >= 0; j--) {
            }
            System.out.println(Arrays.toString(sent));

        }
    }
}
