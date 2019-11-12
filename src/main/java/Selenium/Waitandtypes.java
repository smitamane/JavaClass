package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waitandtypes {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement x= driver.findElement(By.xpath("sdf"));
        wait.until(ExpectedConditions.elementToBeClickable(x));
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);



    }
}
