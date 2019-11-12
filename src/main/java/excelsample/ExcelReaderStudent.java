package excelsample;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExcelReaderStudent {
    public static void main(String[]args) throws IOException, InvalidFormatException {
        File file = new File("C:\\Users\\SangRam\\Desktop\\Students.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("student");
        int rows = sheet.getLastRowNum();
        List<Student> studentsList = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            XSSFRow row = sheet.getRow(i);
            String name = row.getCell(0).getStringCellValue();
            int mark1 = (int) row.getCell(1).getNumericCellValue();
            int mark2 = (int) row.getCell(2).getNumericCellValue();
            int mark3 = (int) row.getCell(3).getNumericCellValue();

            Student students = new Student(name, mark1, mark2, mark3);
            studentsList.add(students);

        }
        workbook.close();
        Collections.sort(studentsList);
        for (Student student : studentsList) {
            System.out.println("Name: " + student.getName() + "  marks:" + (student.getMark1()+student.getMark2()+student.getMark3()));
        }

    }
}
