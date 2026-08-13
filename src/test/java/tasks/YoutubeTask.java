package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class YoutubeTask {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.get("https://www.youtube.com/");
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
            WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
            element.sendKeys("ai testing");
            List<WebElement> alloptions=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='i0']/descendant::span[@role='button']")));
            for (WebElement option:alloptions)
            {
                Thread.sleep(2000);
                if(option.getText().trim().contains("ai testing roadmap"))
                option.click();
                System.out.println("clicked");
                break;
            }
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//yt-formatted-string[contains(@aria-label,'Career Guidance with Ramana 7 minutes, 55 seconds')]"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='top-level-buttons-computed']/descendant::button[@aria-label='Share']")))
              .click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("copy-button"))).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
