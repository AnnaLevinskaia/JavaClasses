package class20;

public class HW2Programming {
    //Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    // then the message "I love programming languages" should be printed. If some String is passed to it,
    // then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.

String str;

void printStr(String str){
    if (str.isEmpty()){
        System.out.println("I love programming languages");
    } else {
        System.out.println("I love java");
    }
}

    public static void main(String[] args) {
        HW2Programming obj = new HW2Programming();
        obj.printStr("hhh");
    }
}

