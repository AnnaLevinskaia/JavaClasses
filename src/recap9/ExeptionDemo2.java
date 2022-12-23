package recap9;

import utils.ExelReader;

import java.io.IOException;

public class ExeptionDemo2 {
    public static void main(String[] args) {
       try {
           ExelReader.read("sdjdjsjdj");
       } catch (IOException e){
           System.out.println("Please contact our support team at support@syntax.com");
       }
    }
}
