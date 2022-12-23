package class24EncapsulationAndArrayList;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("White");
        System.out.println(colors);

        colors.remove("Blue"); //delete by value
        colors.remove(1); //delete by index
        System.out.println(colors);
    }
}
