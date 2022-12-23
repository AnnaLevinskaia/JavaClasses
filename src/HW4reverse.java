public class HW4reverse {
   // How would you reverse a String word by word? for example
    // input=>This is sentence i want to reverse
    // output=>sihT si ecnetnes i tnaw ot esrever

    public static void main(String[] args) {
        String sent="This is sentence i want to reverse";

        //reverse whole sentence
        char[] charArr=sent.toCharArray();
        for(int i=charArr.length-1; i>=0; i--) {
            System.out.print(charArr[i]);
        }
        System.out.println();

        System.out.println("---------");
        //reverse each word
        String[] arr=sent.split(" ");

            for(int k=0; k<arr.length; k++){
                for(int m=arr[k].length()-1; m>=0; m--){
                    System.out.print(arr[k].charAt(m));

                }
                System.out.print(" ");
            }
        System.out.println("----------");
            //other way for loop
        StringBuilder st=new StringBuilder();
            for (int i=0; i<arr.length; i++) {
                String word=arr[i];
                StringBuilder stringBuilder=new StringBuilder(word); //convert to SB
                stringBuilder.reverse();
                arr[i]=stringBuilder.toString(); //convert SB to string
           st.append(arr[i]+" "); //put to original string
            }
        System.out.println(st);

        System.out.println("----------");
            //reverse whole sentence
        System.out.println();
        String letter="This is sentence i want to reverse";
        StringBuilder str=new StringBuilder(letter);
        System.out.println(str.reverse());
    }

}









