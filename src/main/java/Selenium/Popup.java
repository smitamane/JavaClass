package Selenium;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class Popup {
    public static void main(String []args)
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "http://seleniumbyneeds.github.io/resources/e3/";
        WebDriverWait wait = new WebDriverWait(driver,10);
        String pWindow = driver.getWindowHandle();
        System.out.println(driver.getWindowHandle());
        driver.get(url);
        driver.findElement(By.linkText("Details")).click();
        Set<String> handles = driver.getWindowHandles();
        driver.switchTo().window((String) handles.toArray()[1]);
        System.out.println(driver.getWindowHandle());
        System.out.println(driver.findElement(By.xpath("//table//tr[6]/td")).getText());
        driver.close();
        driver.switchTo().window(pWindow);
    }
}
