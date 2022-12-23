package repls;

public class ShoppingStoreThisKeyword {
    String item;
    double price;
    int quantity;

    ShoppingStoreThisKeyword(String item, double price, int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }

    public double itemTotalPrice(){
        double totalPr=price*quantity;
        System.out.println(item+" Total Value "+totalPr);

        return totalPr;
    }

}
class MainM {
    public static void main(String[] args) {
        ShoppingStoreThisKeyword obj1=new ShoppingStoreThisKeyword("Blanket", 99.98, 1);
        double purchase1=obj1.itemTotalPrice();

        ShoppingStoreThisKeyword obj2=new ShoppingStoreThisKeyword("Mattress", 439.18, 1);
        double purchase2= obj2.itemTotalPrice();

        System.out.println("You purchased "+(purchase1+purchase2)+" Today");
    }
}