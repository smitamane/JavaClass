package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Validatepopupvalues {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebDriverWait wait= new WebDriverWait(driver,10);
        String url= "http://seleniumbyneeds.github.io/resources/e3/";
        driver.get(url);
        String parentWindow = driver.getWindowHandle();
        List<WebElement> rows=driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr"));
        for (WebElement row : rows) {
            List<String>expectedvalues=new ArrayList<>();
            for (int i=2;i<=5;i++)
            {
                expectedvalues.add(row.findElement(By.xpath("./td[" + i + "]")).getText());
            }
            System.out.println(expectedvalues.size());
           row.findElement(By.linkText("Details")).click();
            Set<String> handles=driver.getWindowHandles();
            driver.switchTo().window((String) handles.toArray()[1]);
            List<String>actualvalues=new ArrayList<>();
            for(WebElement cell: driver.findElements(By.xpath("//table//tr[position()<=5]/td"))){
                actualvalues.add(cell.getText());
            }
            driver.close();
            driver.switchTo().window(parentWindow);
            validatelist(actualvalues,expectedvalues);
            System.out.println(actualvalues.size());
            }
        }

    private static void validatelist(List<String> actualvalues, List<String> expectedvalues) {
        if(actualvalues.size()==expectedvalues.size())
        {
            System.out.println("Size of rows and window pop up is same");
            for (int i=0;i<actualvalues.size();i++)
            {
                if(actualvalues.get(i).equals(expectedvalues.get(i)))
                {
                    System.out.println("Values in the list-"+actualvalues.get(i)+" Actual Values-"+ expectedvalues.get(i));
                }else
                {
                    System.out.println("Values in the list dont match-"+actualvalues.get(i)+" Actual Values-"+ expectedvalues.get(i));
                }
            }
        }else
        {
            System.out.println("Size dont match");
        }
    }


}

