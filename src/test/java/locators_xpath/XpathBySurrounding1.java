package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathBySurrounding1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.makemytrip.com/");
            Thread.sleep(4000);
            driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='tp-dt-header-icon']//img[@alt='minimize']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//label[@for='departure']")).click();
            String month= driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();

            for(;;)  //infinite iterations
            {
                if (month.equals("March 2027")) {
                    driver.findElement(By.xpath("/div[@class='DayPicker-Caption']/..//p[.='4']")).click();
                    Thread.sleep(1000);
                    break;
                }
                else {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
