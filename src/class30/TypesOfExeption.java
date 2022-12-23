package class30;

public class TypesOfExeption {
    public static void main(String[] args) {
        String name = null;
        if (name != null) {
            System.out.println(name.length());
        }
        System.out.println(name.length());


        int[] arr = new int[5];
        int index = 10;
        try {
            System.out.println(arr[index]);
        } catch (Exception e){
            System.out.println("Send message to developer");
        }
        if(index<arr.length){
            System.out.println(arr[index]);
        }
    }
}
