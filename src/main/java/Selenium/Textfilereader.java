package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.nio.file.Files.readAllLines;

public class Textfilereader {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "http://seleniumbyneeds.github.io/resources/alerts/";
        //WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(url);
        //driver.findElement(By.xpath("//button[@class='addNew']")).click();
        List<String> strings= readAllLines(Paths.get("E:\\SeleniumClasses\\Filetoreadusers.txt"));
        for (String s : strings)
        {
            driver.findElement(By.xpath("//button[@class='addNew']")).click();
            Alert alert=driver.switchTo().alert();
            alert.sendKeys(s);
            alert.accept();
        }
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='tblName']/tbody/tr"));
        if(strings.size() == (rows.size()-1)){
            for(int i = 0;i<strings.size();i++){
                String[] expectedval = strings.get(i).split(",");
                // for (String s : expectedval) {
                for(int j = 0;j<expectedval.length;j++){
                    String actualValue=rows.get(i+1).findElement(By.xpath("./td["+(j+1)+"]")).getText();
                    if(!expectedval[j].equals(actualValue)){
                        System.out.println("Value does not match on row"+(i+1)+" expected"+ expectedval[j]+ " actual" + actualValue);
                    }
                    else
                    {
                        System.out.println("Value match on row" + (i+1)+ " expected" + expectedval[j]+ " actual:" + actualValue);
                    }
                }
            }
        }
        else
        {
            System.out.println("row count does not match:"+strings.size()+ " actual" + (rows.size()-1));
        }


    }
}




