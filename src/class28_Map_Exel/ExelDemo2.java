package class28_Map_Exel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExelDemo2 {
    public static void main(String[] args) throws IOException {

        String path="C:\\Users\\Anna\\IdeaProjects\\JavaClass\\Data\\Test.xlsx";
        //navigate to this part and open it
        FileInputStream fileInputStream=new FileInputStream(path);
        //use special class that can handle the xlsx files
        XSSFWorkbook exel=new XSSFWorkbook(fileInputStream);

        Sheet sheet=exel.getSheet("Sheet1");
        int noOfRows=sheet.getPhysicalNumberOfRows(); //how many rows contain data
        System.out.println(noOfRows);

        for (int i = 0; i < noOfRows; i++) {
            Row row=sheet.getRow(i);
            int noOfCells=row.getPhysicalNumberOfCells();//how many rows contain data

            for (int j = 0; j < noOfCells; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");

            }
            System.out.println();

        }

    }
}
