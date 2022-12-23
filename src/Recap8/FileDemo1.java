package Recap8;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {

        //method that helps us read data from properties files
        //method should be available in other project

        System.out.println(getProperty("password"));

    }

    public static String getProperty(String key) throws IOException {
        String path = "C:\\Users\\Anna\\IdeaProjects\\JavaClass\\Data\\Test.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        return properties.getProperty(key);



    }


}
