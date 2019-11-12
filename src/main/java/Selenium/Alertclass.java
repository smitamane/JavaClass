package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Alertclass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "http://seleniumbyneeds.github.io/resources/alerts/";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(url);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr"));
        for (WebElement row : rows) {
            //Select select = new Select(row.findElement(By.xpath(".//select")));
            //String ratting = select.getFirstSelectedOption().getText().trim();
            String numRatting = row.findElement(By.xpath("./td[6]")).getText().split("first")[0].trim();
            row.findElement(By.xpath(".//a")).click();

            if (numRatting.equals("4")) {
                //if(ratting.equalsIgnoreCase("fourth")){
                wait.until(ExpectedConditions.alertIsPresent());
                driver.switchTo().alert().accept();
                wait.until(ExpectedConditions.alertIsPresent());
                driver.switchTo().alert().accept();
            } else {
                System.out.println("not matching with 4 : " + numRatting);
                wait.until(ExpectedConditions.alertIsPresent());
                driver.switchTo().alert().dismiss();
            }
        }
        driver.close();
    }
}






