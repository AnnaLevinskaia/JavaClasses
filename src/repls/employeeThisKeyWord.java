package repls;

class employeeThisKeyWord{
        String name;
        String lastName;
        int employeeId;
        String starDate;
        int salary;


        employeeThisKeyWord(){

        }

        employeeThisKeyWord(String name, String lastName, int employeeId, String starDate, int salary){
            this.name=name;
            this.lastName=lastName;
            this.employeeId=employeeId;
            this.starDate=starDate;
            this.salary=salary;
        }


        void print(){
            System.out.println(name+" "+lastName+" "+employeeId+" "+starDate+" "+salary);
        }
    }


class MainC {

    public static void main(String[] args) {
        employeeThisKeyWord obj1=new employeeThisKeyWord();
        obj1.print();
        employeeThisKeyWord obj2=new employeeThisKeyWord("Joe", "Smith", 12345, "01/01/1970", 35000);
        obj2.print();


    }
}
