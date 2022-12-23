package repls.InterviewRepls;

import java.util.Scanner;

public class Repl216Array {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int[]arr=arraySumToZero(N);

        for(int num:arr){
            System.out.print(num+" ");
        }


    }


    public static int[] arraySumToZero(int N) {
        int[] arr=new int[N];
        if (N>1){
            for (int i = 1; i < N; i+=2) {
                arr[i-1]=i;
                arr[i]=-i;
            }
            if(N%2 != 0){
                arr[N-1]=0; //last number
            }
        }
        if (N==1){
            arr[0]=0;
        }
        if (N==0){

            arr=new int[0];
        }
        return arr;
    }




}
