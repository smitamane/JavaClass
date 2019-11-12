package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class Report {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumbyneeds.github.io/resources/e3");
    /*    List<WebElement> srs = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[1]"));
        List<WebElement> names = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[2]"));
        List<WebElement> designations = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[3]"));
        List<WebElement> depts = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[4]"));
        List<WebElement> countries = driver.findElements(By.xpath("//table[@class='order-table']/tbody/tr/td[5]"));
        for (int i = 0; i < srs.size(); i++) {
            System.out.println(srs.get(i).getText() + " - " + names.get(i).getText() + " - " + designations.get(i).getText() + " - " + depts.get(i).getText() + " - " + countries.get(i).getText());
        }
    */
        String strxpath = "//table[@class='order-table']/tbody/tr";
        List<WebElement> rows = driver.findElements(By.xpath(strxpath));
       /* for (int i = 1; i <= rows.size(); i++) {
            System.out.println(
                    driver.findElement(By.xpath(strxpath+"["+i+"]/td[1]")).getText() + " - " +
                            driver.findElement(By.xpath(strxpath+"["+i+"]/td[2]")).getText()+ " - " +
                            driver.findElement(By.xpath(strxpath+"["+i+"]/td[3]")).getText()+ " - " +
                            driver.findElement(By.xpath(strxpath+"["+i+"]/td[4]")).getText()+ " - " +
                            driver.findElement(By.xpath(strxpath+"["+i+"]/td[5]")).getText());
        } */
       /* for (WebElement row : rows) {
            System.out.println(row.findElement(By.xpath("./td[1]")).getText()+ " - " +
                    row.findElement(By.xpath("./td[2]")).getText()+ " - " +
                    row.findElement(By.xpath("./td[3]")).getText()+ " - " +
                    row.findElement(By.xpath("./td[4]")).getText()+ " - " +
                    row.findElement(By.xpath("./td[5]")).getText());
        }

        */
        for (WebElement row : rows) {
            String strop="";
            for(int i=1;i<=5;i++){
                strop+=(row.findElement(By.xpath("./td["+i+"]")).getText()+ " - ");
            }
            System.out.println(strop);
        }


        driver.close();







    }
}

