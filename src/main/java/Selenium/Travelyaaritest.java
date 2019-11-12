package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Travelyaaritest  {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String fromCity = "Pune";
        String toCity = "Nagpur";
        String strDate=new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        String url = "https://www.travelyaari.com/search/"+fromCity+"-to-"+toCity+"?departDate="+strDate+"&mode=oneway";
        driver.get(url);
        List<WebElement> travels= driver.findElements(By.xpath("//div[@class='srch-card']"));
        String strminPrice= travels.get(0).findElement(By.xpath(".//div[contains(@class,'srch-top')]//div[@class='fare-st-blk']/div[1]")).getText();
        double minPrice=Double.parseDouble(strminPrice.replace("₹","").trim());
        WebElement tvCard=travels.get(0);
        for (WebElement travel : travels) {
            System.out.println(travel.findElement(By.xpath(".//div[@class='label-blk']/div")).getText());
            String strCurFare = travel.findElement(By.xpath(".//div[contains(@class,'srch-top')]//div[@class='fare-st-blk']/div[1]")).getText().replace("₹", "").trim();
            double curFare;
            try {
                curFare = Double.parseDouble(strCurFare);
            }catch (NumberFormatException e){
                curFare = Double.parseDouble(strCurFare.split(" ")[0]);
            }

            if(minPrice>curFare){
                minPrice = curFare;
                tvCard = travel;
            }
        }

        System.out.println("Min fare is:" + minPrice);
        System.out.println(tvCard.findElement(By.xpath(".//div[@class='label-blk']/div")).getText());
        tvCard.findElement(By.xpath(".//div[text()='Select Seat']")).click();
        String seatsinlowerbirth= tvCard.findElement(By.xpath("//div[@class='deck-details']//span[2]")).getText();
        String lowerbith=seatsinlowerbirth.replace("Lower berth -","").replace("seats available","");
        System.out.println(lowerbith);
        int lowerbirthseat=Integer.parseInt(lowerbith.trim());
        System.out.println("Seats available in Lowerbirth : -"+lowerbirthseat);

        String seatsinupprerbirth= tvCard.findElement(By.xpath("//div[@class='upper-deck']//span[2]")).getText();
        String upperbith=seatsinupprerbirth.replace("Upper berth -","").replace("seats available","");
        System.out.println(upperbith);
        int upperbirthseat=Integer.parseInt(upperbith.trim());
        System.out.println("Seats available in Lowerbirth : -"+upperbirthseat);
        System.out.println("Total seats available:-"+ (upperbirthseat+lowerbirthseat));
    }
}

