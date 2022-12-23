package class29_Exel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ReadingExelFileDemo1 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\Anna\\IdeaProjects\\JavaClass\\Data\\Test.xlsx";
        //navigate to that file and open it
        FileInputStream fileInputStream=new FileInputStream(path);
        //use special class that can handle the xlsx files
        XSSFWorkbook exel=new XSSFWorkbook(fileInputStream);

        Sheet sheet=exel.getSheet("Sheet1"); //exactly the same name os sheet as in exel file

        int noOfRow=sheet.getPhysicalNumberOfRows();
        Row headerRow=sheet.getRow(0); //getting the first row - we can use it as a key for map

        //the map that will store the data for each row
        //LinkedHashMap<String, String> rowMap=new LinkedHashMap();

        //list that can holds maps
        ArrayList<LinkedHashMap<String, String>> excelData=new ArrayList<>();

        //loop that does through all the rows that contain data
        for (int rowNo = 1; rowNo < noOfRow; rowNo++) {
            LinkedHashMap<String, String> rowMap=new LinkedHashMap();
            Row dataRow=sheet.getRow(rowNo); //get a data raw from sheet one by one that contains data
            int noOfCell=dataRow.getPhysicalNumberOfCells();
            //loop that does through all the cells that contain data
            for (int cellNo = 0; cellNo < noOfCell; cellNo++) { //get data from the row

                //storing keys from header row and values from data row
                String key=headerRow.getCell(cellNo).toString(); //toString()- to convert cell to a string, because getSell return cell
                String value=dataRow.getCell(cellNo).toString();
                rowMap.put(key, value);
            }
            excelData.add(rowMap);
            //System.out.println(rowMap);
        }

        System.out.println(excelData);
    }
}
