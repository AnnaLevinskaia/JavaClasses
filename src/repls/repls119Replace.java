package repls;

public class repls119Replace {

    String censorLetter(String a, String b){
        String cenLet=a.replaceAll(b,"*");
        return cenLet;
    }


    public static void main(String[] args) {
        repls119Replace obj=new repls119Replace();
        System.out.println(obj.censorLetter("computer science","e"));


    }
}
