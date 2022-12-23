package class16;

public class HW2teacher {

    public static String reverseStr(String str){
       /* String newStr;
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        newStr=sb.toString();
        return newStr;*/
        return new StringBuilder(str).reverse().toString(); //convert to Str builder - reverse - convert to string
    }

    public static void main(String[] args) {
        System.out.println(HW2teacher.reverseStr("Sunday"));
    }
}
