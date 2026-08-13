package using_synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        try
        {
            driver.manage().window().maximize();
            driver.get("");
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element=wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("")));
            element.click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
