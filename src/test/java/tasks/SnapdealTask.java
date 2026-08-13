package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SnapdealTask {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.snapdeal.com/");
            String parentId=driver.getWindowHandle();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='search-box-input']")).sendKeys("mens watch");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[@class='HeaderStyle__AutoSuggestionsEle-sc-dc90d7cb-13 loWdqC']/span"))
                    .click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@pogid='676339723106']/p"))
                    .click();
            Thread.sleep(4000);

            Set<String> allpageIds=driver.getWindowHandles();
            for (String pageId:allpageIds)
            {
                if(!pageId.equals(parentId))
                {
                    driver.switchTo().window(pageId);
                    Thread.sleep(4000);
                    driver.findElement(By.xpath("//span[text()='add to cart']")).click();
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
