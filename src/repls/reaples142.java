package repls;

public class reaples142 {

    String schoolName;
    int batch;
    int year;
    String lastDayofClass;

    reaples142(String schoolName, int batch, int year, String lastDayofClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayofClass=lastDayofClass;

    }
    reaples142(){
        //System.out.println(schoolName+batch+year+lastDayofClass);
    }

    public void printInfo(){
        System.out.println(schoolName+batch+year+lastDayofClass);
    }

    public static void main(String[] args) {
        reaples142 obj1=new reaples142("Syntax", 9, 2009, "7");
        obj1.printInfo();
        reaples142 obj2=new reaples142();
        obj2.printInfo();
    }
}
