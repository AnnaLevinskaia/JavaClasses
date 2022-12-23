package class22;

public class Car {
    void start(){
        System.out.println("Use key to start me");
    }
    void stop(){
        System.out.println("Use brakes to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}

class BMW extends Car{
    void start(){
        System.out.println("Use Push to start me");
    }
    void stop(){
       super.stop(); //use super to call constructor from parent class
       System.out.println("You can use auto breaking system");
}

}

class Toyota extends Car{
    void start(){
        System.out.println("Push me to strart");
    }
}

class Tesla extends Car{
    void start(){
        System.out.println("Use app to start me");
    }
    void stop(){
        System.out.println("Use AI and Auto brak");
    }
    void park(){
        System.out.println("I can park myself");
    }


}