package class19;
//Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
// Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
// Print users name, mobile number and address in userDetails method. Test.xlsx your code.
public class HW4userClass {
    String name;
    String mobNum;
    String address;

    HW4userClass(String name, String mobNum) {
        this.name = name;
        this.mobNum = mobNum;
    }

}


class userInfo extends HW4userClass {
    String address;

    userInfo(String name, String mobNum, String address) {
        super(name, mobNum);  //if parent has it, we must put it inside child class
        this.address = address;
    }


    public void userDetails() {
        System.out.println(address+name+mobNum);
    }
}

class Testt{
    public static void main(String[] args) {
       // Testt tes=new Testt("Anna","1212", "Nhh");
     // tes.userDetails();
       // new HW4userClass("Anna", 1234567890).userDetails();
    }


}