package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumbyneeds.github.io/resources/ui/checkbox.html");
       /* java.util.List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
        java.util.List<WebElement> elementchk = driver.findElements(By.xpath("//input[@type='checkbox' and position() %2==0]"));
        int i = 1;
        for (WebElement element : elements) {
            if (i++ % 2 == 0) {
                handleCheckBox(element, false);
            } else {
                handleCheckBox(element, false);
            }
        }*/
        driver.get("http://seleniumbyneeds.github.io/resources/ui/multiselect.html");
       WebElement selectelements = (WebElement) driver.findElements(By.xpath("//input[@type='checkbox']"));
       Select myselect =new Select(selectelements);

        //for(int i=0;i<myselect.getOptions().size();i++) {
        //myselect.selectByIndex(i);
        //System.out.println(myselect.getOptions().get(i).getText());
        //}
        java.util.List<WebElement> options=myselect.getOptions();
       for (WebElement option:options)
       {

       }


    }

    private static void handleCheckBox(WebElement checkbox, boolean check) {
        if((checkbox.isSelected()&&!check)||(!checkbox.isSelected()&&check))
        checkbox.click();


    }

}
