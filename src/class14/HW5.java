package class14;

//Create a method createEmail(). Based on values of users name, lastName and email type,
// your method should return complete email Address. Example:
// createEmail(John, Snow, gmail) → johnsnow@gmail.com or
public class HW5 {

    String creatEmail(String firstName, String secondName, String emailType) {

        return(firstName+secondName+"@"+emailType).toLowerCase();
    }

    public static void main(String[] args) {
        HW5 email=new HW5();
        String fullEmail=email.creatEmail("Anna","Levinskaya","gmail.com");
        System.out.println(fullEmail);
    }


}
