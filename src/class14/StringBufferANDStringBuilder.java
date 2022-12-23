package class14;

public class StringBufferANDStringBuilder {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder(" Today is java class"); //this is faster, in jeneral it is the same
        StringBuffer stringBuffer=new StringBuffer("Today is java class"); //older
stringBuffer.reverse();
        System.out.println(stringBuffer);

        String str="Java is very easy"; //how to convert string to string builder
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);
        String newStr=stringBuilder1.toString(); //convert stringBuilder to string






    }
}
