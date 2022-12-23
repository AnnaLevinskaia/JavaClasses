package class19;

public class HW5 {
/*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test.xlsx your code
     */
public static void main(String[] args) {

}
}

class Shape{
    double radius;
    Shape(double radius){
        this.radius=radius;

    }

    public static void main(String[] args) {
        Circle obj=new Circle(2);
        obj.calculateArea();
    }
}

class Circle extends Shape{

    Circle(double radius) {
        super(radius);
    }

    void calculateArea(){
       // System.out.println(Math.PI*Math.pow(radius,2));
        System.out.println(3.14*radius*radius);
    }
}