package locators_xpath;

//conatins can be use to select partial text or value
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBycontains
{
    public static void main(String[] args)
    {

        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.imdb.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='suggestion-search']")).sendKeys("dark Knight");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@id='suggestion-search-button']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//h4[contains(text(),'The Dark Knight')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(.,'Mark as watched')]")).click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
