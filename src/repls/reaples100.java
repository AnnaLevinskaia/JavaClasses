package repls;

import java.util.Scanner;

public class reaples100 {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

//        for (int i=0; i<s.length();i++) {
//            for (int j = s.length() - 1; j > 0; j--) {
//            }
//        }
//        System.out.println(Array.toString());
        for(int i=s.length()-1; i>=0; i--) {
            System.out.print(s.charAt(i));
        }


    }
}
