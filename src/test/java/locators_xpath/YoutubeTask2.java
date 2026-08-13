package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTask2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.youtube.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//yt-formatted-string[contains(.,'Music')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[contains(@class,'ytSearchbox')]")).sendKeys("A sky full of stars"); //gave partial attribute value
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[contains(@class,'ytSearchboxComponentSearch')]")).click(); //gave partial attribute value
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[contains(@aria-label,'@coldplay  - A Sky Full Of Stars (Lyrics')]")).click();
            Thread.sleep(2000);
            driver.manage().window().fullscreen();
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }
}
