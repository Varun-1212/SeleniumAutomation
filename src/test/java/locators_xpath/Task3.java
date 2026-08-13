package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://demowebshop.tricentis.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[.='book']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[normalize-space(.)='Health Book']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='button-2 email-a-friend-button']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("friend@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@class='your-email']")).sendKeys("my@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']")).click();
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText());
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
    }
}
