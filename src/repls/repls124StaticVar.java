package repls;

public class repls124StaticVar {

    static String ss="Welcome To Syntax Technologies";
 void method(){
  System.out.println(ss);
}

    public static void main(String[] args) {
        System.out.println(ss);
        repls124StaticVar obj=new repls124StaticVar();
        System.out.println(obj.ss);
        obj.method();

    }
}
