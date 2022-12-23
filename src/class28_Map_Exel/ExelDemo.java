package class28_Map_Exel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDemo {
    public static void main(String[] args) throws IOException {
        //we need to know path of the file

        String path="C:\\Users\\Anna\\IdeaProjects\\JavaClass\\Data\\Test.xlsx";
        //navigate to this part and open it
        FileInputStream fileInputStream=new FileInputStream(path);
        //use special class that can handle the xlsx files
        XSSFWorkbook excelFile=new XSSFWorkbook(fileInputStream);

        Sheet sheet=excelFile.getSheet("Sheet1");
        Row row0=sheet.getRow(0);
        System.out.println(row0.getCell(0));

        //get the data from row 1
        Row row1=sheet.getRow(1);
        System.out.println(row1.getCell(0));



    }
}
