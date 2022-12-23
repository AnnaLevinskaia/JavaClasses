package repls.InterviewRepls;

import java.util.Scanner;

public class Repl223Pyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j=i; j<number; j++){
                System.out.print(" ");
            }

           for(int k=1; k<(i*2); k++){
               if(i==1){
                   System.out.print(" ");
               }
                System.out.print(number);
            }
            System.out.println();
        }

    }
}
