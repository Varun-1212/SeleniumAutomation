package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeCommentXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.youtube.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("dude orchestral suite");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//yt-formatted-string[@aria-label='Dude – Orchestral Suite 2 minutes, 6 seconds']"))
                    .click();
            Thread.sleep(6000);
            String comment=driver.findElement(By.xpath("//button[@aria-label='@aassamrafik']/ancestor::div[@id='body']/descendant::span[@class='ytAttributedStringHost ytAttributedStringWhiteSpacePreWrap']"))
                    .getText();
            System.out.println(comment);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
