package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppersstackExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        try
        {
           driver.manage().window().maximize();
           driver.get("https://www.shoppersstack.com/");
            WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='electronics']"))).click();
//            WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
//            wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='electronics']"))).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
