package excelsample;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Numbersdivisibleby {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        File file = new File("C:\\Users\\SangRam\\Desktop\\Table.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet =workbook.getSheet("0");
        int rows=sheet.getLastRowNum();
        int columns = sheet.getDefaultColumnWidth();
        for(int i=0; i<=rows;i++)
        {
            for(int j=0;j<=columns;j++) {
                XSSFRow number = sheet.getRow(i);
                int divisior = (int) number.getCell(1).getNumericCellValue();
                if (divisior % 7 == 0) {
                    System.out.println(divisior);
                }
            }
        }
    }
}
