package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class XpathBySurrounding2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.cleartrip.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[name()='svg' and @data-testid='closeIcon']")).click();
            driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']")).click();
            WebElement monthbox=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));

            for (;;)
            {
                if(monthbox.getText().equalsIgnoreCase("October 2026"))
                {
                    driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/..//div[text()='11']")).click();
                    break;
                }
                else
                {
                    Thread.sleep(1000);
                    driver.findElement(By.xpath("//*[name()='svg' and @data-testid='rightArrow']")).click();
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
