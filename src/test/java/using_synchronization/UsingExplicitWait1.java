package using_synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingExplicitWait1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        try
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
            driver.get("https://www.shoppersstack.com/");
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions
                    .visibilityOfElementLocated(By.xpath("//button[@id='loginBtn']"))).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Email']"))).sendKeys("abc@gmail.com");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Password']"))).sendKeys("password123");

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Login']"))).click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
