package repls;

public class repls122 {

    String countryName;
    String capital;
    int population;

    void method(){
        System.out.println("The capital of "+countryName+" is "+capital+" and population is "+population);
    }

    public static void main(String[] args) {
        repls122 obj1=new repls122();
        obj1.countryName="USA";
        obj1.capital="Washington DC";
        obj1.population=330000000;
        obj1.method();

        repls122 obj2=new repls122();
        obj2.countryName="Kazakhstan";
        obj2.capital="Astana";
        obj2.population=18500000;
        obj2.method();


    }
}
