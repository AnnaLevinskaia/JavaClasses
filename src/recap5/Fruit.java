package recap5;

public class Fruit {

    protected static boolean fresh;
    protected String name;
    String shape;
    private String color;
    final public static boolean FRESH=true;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit(String name, String shape, String color) {
        this (name);
        this.shape = shape;
        this.color = color;
    }

    public void grow(){
        System.out.println("All fruits grow fresh");
    }

    protected void benefits(){
        System.out.println("All fruits good for your health");
    }

    public static void havePeel(){
        System.out.println("All fruits need to be peel");
    }




}
