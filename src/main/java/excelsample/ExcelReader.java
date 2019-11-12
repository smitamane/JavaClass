package excelsample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {
public static void main(String[]args) throws IOException, InvalidFormatException {

        File file = new File("C:\\Users\\SangRam\\Desktop\\Boys.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Boys");
        int rows = sheet.getLastRowNum();
        List<Boy> boyList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            XSSFRow row = sheet.getRow(i);
            String name = row.getCell(0).getStringCellValue();
            int age = (int) row.getCell(1).getNumericCellValue();
            Boy boy = new Boy(name, age);
            boyList.add(boy);

        }
        workbook.close();

        Collections.sort(boyList);
        for (Boy boy : boyList) {
            System.out.println("Name: " + boy.getName() + "  Age:" + boy.getAge());
        }

    }
}
