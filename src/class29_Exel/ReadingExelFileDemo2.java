package class29_Exel;

import utils.ExelReader;

import java.io.IOException;

public class ReadingExelFileDemo2 {
    public static void main(String[] args) throws IOException {
        var exelData=ExelReader.read("C:\\Users\\Anna\\IdeaProjects\\JavaClass\\Data\\Test.xlsx");
        System.out.println(exelData);
    }
}
