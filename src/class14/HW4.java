package class14;

//Create a method that will say Hello in different language based on the country that will passed when method is executed
public class HW4 {

    void Country (String countryL) {
        switch (countryL) {
            case "USA":
                System.out.println("Hello");
                break;
            case "Spain":
                System.out.println("Ola!");
                break;
            case "Russia":
                System.out.println("Privet!");
                break;
            default:
                System.out.println("Country not supported");
        }
    }

    public static void main(String[] args) {
        HW4 cn = new HW4();
        cn.Country("Spain");
    }


}
