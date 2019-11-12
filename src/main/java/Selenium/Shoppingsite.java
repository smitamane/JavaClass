package Selenium;

import com.sun.xml.internal.ws.org.objectweb.asm.ByteVector;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class Shoppingsite {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        //Login Code
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='header_user_info']//a[contains(text(),'Sign in')]"))).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("smitama87@gmail.com");
        driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Test_1234");
        driver.findElement(By.xpath("//p[@class='submit']//button[@name='SubmitLogin']")).click();
        //Assert for Smita Mane login
        driver.findElement(By.xpath("//span[contains(text(),'Smita mane')]")).isDisplayed();
        System.out.println("Login by Smita Mane");
        sleep(200);
        //Insert search term:
        driver.findElement(By.xpath("//input[@value='search']")).sendKeys("Dress");
        WebElement selectprod= driver.findElement(By.xpath("//select[@id='selectProductSort']"));
        Select myselect = new Select(selectprod);
        myselect.selectByValue("Price: Lowest first");
        //Select the filter and image
        driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']")).click();
        String costprice=driver.findElement(By.xpath("//form[@id='buy_block']//span[@id='our_price_display']")).getText();
        System.out.println("Cost price of Dress:-" +costprice);
        driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
        String finalcost=driver.findElement(By.xpath("//div[@class='layer_cart_row']//span[@class='ajax_block_products_total']")).getText();
if(costprice.equals(finalcost))
{
    System.out.println("Cost on product and final cost is same: "+finalcost);
    driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
    String totalproduct=driver.findElement(By.xpath("//tr[@class='cart_total_price']//td[@id='total_product']")).getText();
    totalproduct.equals(finalcost);
    System.out.println("Both price are equal:-"+ totalproduct);
    driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
    driver.findElement(By.xpath("//ul[@class='address item box']")).isDisplayed();
    driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
    driver.findElement(By.xpath("//p[text()='Terms of service']")).isDisplayed();
    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
    driver.findElement(By.xpath("//span[@class='checked']")).isSelected();
    System.out.println("Term and conditions are checked");
    driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Proceed to checkout')][1]")).click();
    String comparecost=driver.findElement(By.xpath("//tr[@class='cart_total_price']//td[@id='total_product']")).getText();
    comparecost.equals(totalproduct);
    System.out.println("Final cost is equal: "+comparecost);
    driver.findElement(By.xpath("//a[@class='cheque'] ")).click();
    Alert alert= driver.switchTo().alert();
    alert.accept();
    


}

    }
}
