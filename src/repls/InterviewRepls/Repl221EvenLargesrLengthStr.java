package repls.InterviewRepls;

/*Find the largest even length word from a String
        if there are two words with same largest even length return the first one.
        if there are not even words return -1*/
public class Repl221EvenLargesrLengthStr {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println(findMaxLenEven(str));
    }

    public static String findMaxLenEven(String str) {

        String[] arrStr = str.split(" ");
        String lengthMax = "n";
        for (int i = 0; i < arrStr.length; i++) {

            if (arrStr[i].length() % 2 == 0) {
                if (arrStr[i].length() > lengthMax.length()) {
                    lengthMax = arrStr[i];
                }
            }
        } if(lengthMax=="n"){
            System.out.println("-1");
        }
        return lengthMax;
    }
}

