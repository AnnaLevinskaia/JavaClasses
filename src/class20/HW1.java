package class20;

public class HW1 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box

    double areaOfVolume(double a, double b){
        double areaOfVolume=a*b;
        return areaOfVolume;
    }

    double areaOfVolume(double a){
        double areaOfVolume=a*a;
        return areaOfVolume;
    }

    double areaOfVolume(double a, double b, double c){
        double areaOfVolume=a*b*c;
        return areaOfVolume;
    }
}

class Test{
    public static void main(String[] args) {
HW1 obj1=new HW1();
System.out.println(obj1.areaOfVolume(2));
System.out.println(obj1.areaOfVolume(2, 2));
System.out.println(obj1.areaOfVolume(2, 1, 1));

    }
}