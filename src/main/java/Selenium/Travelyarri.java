package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class Travelyarri {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumbyneeds.github.io/resources/e3");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Admin");
        //driver.findElement(By.xpath("//input[@class='advCheck']")).click();
        List<WebElement> department=driver.findElements(By.xpath("//tr[@class='ng-scope' and @style='display: table-row;']//td[4]"));
        for (WebElement dept:department)
        {
            String value=dept.getText();
            //System.out.println(value);
            if(value.equals("ADMIN"))
            {
                System.out.println("Report display all Admin result");
            }
            else {
                System.out.println("Incorrect data in report");
            }


        }




    }
}
