package class16;

public class HW2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    // Method should be available to all classes within your project and accessible by class name.

    public String reverce(String str){
        String st="";
        for (int i=str.length()-1; i>=0; i--) {
            st=st+str.charAt(i);
        }
        return st;
    }

    public static void main(String[] args) {
        HW2 obj=new HW2();
        System.out.println(obj.reverce("Hello"));
    }
}
