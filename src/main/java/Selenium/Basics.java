package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Basics {
    public static void main(String [] args)
    {
        System.setProperty("webdriver.chrome.driver","E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://seleniumbyneeds.github.io/resources/e3/");
        List<WebElement> srno = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[1]"));
        List<WebElement> names = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[2]"));
        List<WebElement> Designation = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[3]"));
        List<WebElement> depart = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[4]"));
        List<WebElement> country= driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[5]"));
        List<WebElement> rating = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[6]"));

        for(int i=0;i< srno.size();i++)

        {
            System.out.println(srno.get(i).getText()+ "-" +names.get(i).getText()+"-" +Designation.get(i).getText());
        }


    }

}

