package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTask
{
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.youtube.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("moon knight trailer");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Moon Knight Teaser Trailer Hindi. || Marvel Studios India Hindi.']"))
                    .click();
            Thread.sleep(2000);
            driver.manage().window().fullscreen();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
