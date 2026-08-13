package using_synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class UsingFluentWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.get("https://www.demoblaze.com/");
            FluentWait<WebDriver> wait=new FluentWait(driver);
            wait.pollingEvery(Duration.ofSeconds(2));
            wait.withTimeout(Duration.ofSeconds(20));
            wait.ignoring(NoSuchElementException.class);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sony xperia z5']"))).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
