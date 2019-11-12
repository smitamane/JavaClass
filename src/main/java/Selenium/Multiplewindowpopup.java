package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Multiplewindowpopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "http://seleniumbyneeds.github.io/resources/popup/";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String parentWindow = driver.getWindowHandle();
        driver.get(url);

        int windowcount = 1;
        while (driver.findElements(By.linkText("Click Me for Answer")).size() > 0) {
            driver.findElement(By.linkText("Click Me for Answer")).click();
            Object[] windowList = driver.getWindowHandles().toArray();
            driver.switchTo().window(windowList[windowList.length - 1].toString());
            windowcount++;
        }
        String answer = "";
        for (int i = 0; i < windowcount; i++) {
            if (i == 0) {
                answer = driver.findElement(By.xpath("//div[@id='kount']/h1")).getText().replace("Answre is:", "").trim();
            } else {
                driver.findElement(By.id("ans")).sendKeys(answer);
                driver.findElement(By.xpath("//button")).click();
                answer = driver.findElement(By.id("nxa")).getText();
            }
            System.out.println(answer);
            if (i < (windowcount - 1)) {
                driver.close();
                driver.switchTo().window(driver.getWindowHandles().toArray()[driver.getWindowHandles().size() - 1].toString());
                Thread.sleep(1000);
            }
        }

    }}
