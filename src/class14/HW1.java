package class14;

import java.util.Scanner;

public class HW1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void numbers(int first, int second) {
        if (first > second) {
            System.out.println("First number ia larger");
        } else if(second>first) {
            System.out.println("Second number is larger");
        } else {
            System.out.println("Numbers are equal");
        }
    }

        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter first number");
            int first=sc.nextInt();
            System.out.println("Enter second number");
            int second=sc.nextInt();
            HW1 num = new HW1();
            num.numbers(first, second);
            num.numbers(200, 45);

        }

    }



