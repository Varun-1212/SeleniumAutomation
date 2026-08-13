package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AjioAutoSuggestions {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.ajio.com/");
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input#search"))).sendKeys("Watch");
            List<WebElement> alloptions=wait.until(ExpectedConditions.visibilityOfAllElements
                    (driver.findElements(By.xpath("//div[@class='FUM3I']/descendant::li"))));
            for (WebElement option : alloptions)
            {
               if (option.getText().contains("Titan"))
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
