package class24EncapsulationAndArrayList;

import java.util.ArrayList; //we need to import because it is not present in length package
import java.util.Arrays;

public class WhyCollectionsFramework {
    public static void main(String[] args) {
        //if we have to store a single or two value we should use variables
        String name1 ="Josh";
        String name2="Joe";
        System.out.println(name1);
        System.out.println(name2);
        //or if we have to store more than 2 values of same kind(similar type - names, another array - breed)
        //than we should go with array
        String[] names={"Bob","Adam","Joe"};

        //problem with array: fixed in size(we need to know in advance how much data we gonna to store);

        String[] breeds=new String[5]; //create array and we need to specify size
        breeds[0]="BullDogs";
        System.out.println(Arrays.toString(breeds));

        ArrayList<String> colors=new ArrayList<>(); //don't need to specify size
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors);
//arrays faster and take more memory, arrays list slower and take less space
// arraylist have much more methods than array and arrayList is flexible

        System.out.println(colors.contains("Green"));
    }
}
