package repls;

import java.util.Scanner;

public class reaples101 {
    public static void main(String[] args) {
//Write a for loop that will print out every other letter in a String, starting with the first letter.
// These letters should be printed all on one line with no space in between.
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below
        for (int i=0; i<word.length(); i++) {
            System.out.print(word.charAt(i)+" ");
        }



    }
}
