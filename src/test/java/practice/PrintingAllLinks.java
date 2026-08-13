package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PrintingAllLinks {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.amazon.in/");
            List<WebElement> elements=driver.findElements(By.cssSelector("a[href]"));
            int count=0;
            for (WebElement ele:elements) {
                String links=ele.getAttribute("href");
                if(!links.isEmpty() && links!=null)
                {
                    System.out.println(links);
                    count++;
                }
            }
            System.out.println(count);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
