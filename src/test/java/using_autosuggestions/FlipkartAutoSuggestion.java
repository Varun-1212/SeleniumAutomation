package using_autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FlipkartAutoSuggestion {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        try
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.flipkart.com/");
            driver.findElement(By.cssSelector("span.b3wTlE")).click();
            driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25']")).sendKeys("prestige");
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            List<WebElement> alloptions= wait.until(ExpectedConditions.visibilityOfAllElements
                    (driver.findElements(By.xpath("//ul[contains(@class,'VCplLH lTpUwR bRjjI')]/descendant::div[contains(@class,'VDtK0l _1psv1ze2u _')]"))));
            for(WebElement option : alloptions)
            {
                if(option.getText().equalsIgnoreCase("prestige air fryer"))
                {
                    option.click();
                    break;
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
