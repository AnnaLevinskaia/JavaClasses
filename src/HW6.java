public class HW6 {
    public static void main(String[] args) {
        // //How would you swap  2 strings without a temporary variable?

        String a="Anna";
        String b="Mary";

        a=a+b;

      //  b=a.substring(0, a.length()-b.length());
     //   a=a.substring(b.length());
       // System.out.println(a+b);

        b=a.replace(b, "");
        a=a.replace(b,"");
        System.out.println(a);
        System.out.println(b);




    }
}
