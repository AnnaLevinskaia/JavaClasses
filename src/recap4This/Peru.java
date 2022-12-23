package recap4This;
public class Peru extends Country {
    double salary;

    //compiler create a constructor Peru by default. Call is happening with super.
    //This is why we have "Country class constructor" in output.
//    Peru(){
//        super();  call parent constructor
//    }

    public static void main(String[] args) {

        Peru peru=new Peru();
        peru.name="Peru";
        peru.capital="Lima";
        peru.population=22000000;
        peru.salary=500;

    }
    }

    class Country{  //parent class
        public String name;
        protected String capital;
        int population;
        private String president;

        Country(){
            System.out.println("Country class constructor");
        }
    }

    class USA extends Country{
        public static void main(String[] args) {

            USA usa = new USA();
            usa.name="USA";
            usa.capital="DC";



        }
    }