package repls;

public class Encapsulation {
    class EncapsulationDemo{

        private String empName;
        private int empAge;

        public EncapsulationDemo(String empName, int empAge){
            setEmpName(empName);
            setempAge(empAge);
        }

        public String getName(){
            return empName;
        }

        public int getAge(){
            return empAge;
        }


        public void setEmpName(String empName){
            this.empName=empName;
        }

        public void setempAge(int empAge){
            this.empAge=empAge;
        }

    }
}
