package class16;

public class HW3teachers {

    private static String getVowels(String str){
     /*   String newStr=str.replaceAll("[^aeiouAEIOU]","");
        return newStr;*/

        return str.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {

        System.out.println(getVowels("Humera"));
    }

}
