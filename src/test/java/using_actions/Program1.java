package using_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Program1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
          driver.manage().window().maximize();
          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
          driver.get("https://vinothqaacademy.com/mouse-event/");
          WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
          Actions actions=new Actions(driver);
          actions
            .click(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("//button[@id='resetBtn']"))))
                  .pause(Duration.ofSeconds(2))
                  .contextClick(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='rightBtn']"))))
                  .pause(Duration.ofSeconds(2)).doubleClick(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='doubleBtn']"))))
                  .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
