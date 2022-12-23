package repls;

public class reaples138 {
    private void AM1(){
        System.out.println("private");
    }
   public void AM2(){
        System.out.println("default");
    }

}

class Main extends reaples138 {
    public static void main(String[] args) {
        Main obj1=new Main();
        obj1.AM2();

    }



}
