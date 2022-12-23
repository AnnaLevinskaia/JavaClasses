package class28_Map_Exel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anna\\IdeaProjects\\JavaClass\\Data\\config.properties";
        FileInputStream fileInputStream=new FileInputStream(path); //helps us to navigate to the file
        var properties=new Properties(); //special software that help read data from the file
        properties.load(fileInputStream); //loads all the data from the file inside java code

        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close(); //close the file


    }
}
