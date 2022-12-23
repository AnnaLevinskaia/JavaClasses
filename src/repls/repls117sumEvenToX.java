package repls;

public class repls117sumEvenToX {
//calculate the sum of the EVEN integers from 1 to x (including x)
int sumEvenToX(int x){
        int sum=0;
        for(int i=1; i<=x; i++) {
            if (i%2==0){
               sum=sum+i;
        }
        }

        return sum;
    }

    public static void main(String[] args) {
        repls117sumEvenToX obj=new repls117sumEvenToX();

        System.out.println(obj.sumEvenToX(5));



    }
}
