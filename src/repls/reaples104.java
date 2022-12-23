package repls;

import java.util.Scanner;

public class reaples104 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String[] name = new String[5];
            System.out.println("Please enter 5 names?");
            for(int i=0; i<5; i++){
                name[i] = input.next();
                if(name[i].length()>3){
                    System.out.println(name[i].substring(0,3));
                }

            }


        }
    }

