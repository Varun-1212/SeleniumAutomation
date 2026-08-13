package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task4 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://demowebshop.tricentis.com/");
            driver.findElement(By.xpath("//a[normalize-space()='Electronics']")).click();
            driver.findElement(By.xpath("(//a[normalize-space()='Cell phones'])[4]")).click();
            driver.findElement(By.xpath("//a[.='Phone Cover']")).click();
            driver.findElement(By.xpath("//img[@src=\"https://demowebshop.tricentis.com/content/images/thumbs/0000213_phone-cover_70.png\"]"))
                    .click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@class=\"mfp-close\"]")).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
