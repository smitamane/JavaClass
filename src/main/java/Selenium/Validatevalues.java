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
import java.util.concurrent.TimeUnit;

public class Validatevalues {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String url = "http://seleniumbyneeds.github.io/resources/e3/";
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get(url);
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr"));
        for (WebElement row : rows) {
            List<String> expectedValues = new ArrayList<>();
            for (int i = 2; i <= 5; i++) {
                expectedValues.add(row.findElement(By.xpath("./td[" + i + "]")).getText());
            }
            row.findElement(By.linkText("Inline")).click();
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
            // driver.switchTo().frame(0);
            List<String> actualValues = new ArrayList<>();
            for (WebElement cell : driver.findElements(By.xpath("//td"))) {
                actualValues.add(cell.getText());
            }
            valdateList(actualValues, expectedValues);
            driver.switchTo().defaultContent();
            driver.findElement(By.cssSelector(".closeFrame")).click();
        }
        driver.close();
    }

    private static void valdateList(List<String> actualValues, List<String> expectedValues) {
        if (actualValues.size() == expectedValues.size()) {
            for (int i = 0; i < actualValues.size(); i++) {
                if (actualValues.get(i).equals(expectedValues.get(i))) {
                    System.out.println("Value matche expected:" + expectedValues.get(i) + " and actual:" + actualValues.get(i));
                } else {
                    System.out.println("Value not matche expected:" + expectedValues.get(i) + " and actual:" + actualValues.get(i));
                }
            }
        } else {
            System.out.println("size not matched");
        }
    }
}



