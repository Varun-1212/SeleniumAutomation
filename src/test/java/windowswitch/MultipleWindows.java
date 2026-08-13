package windowswitch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");
        String parentId= driver.getWindowHandle();
        System.out.println(parentId);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lava a2");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

        Thread.sleep(2000);
        List<WebElement> mobiles= driver.findElements(By.xpath("//a[@class='a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal']"));

        for (int i=0;i<=2;i++)
        {
            mobiles.get(i).click();
            Thread.sleep(1000);
        }

        Set<String> allpageIds=driver.getWindowHandles();

        for (String pageId:allpageIds)
        {
            if(!pageId.equals(parentId))
            {
                driver.switchTo().window(pageId);
                Thread.sleep(6000);
                String mobileName=driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
                System.out.println(mobileName);
                System.out.println("-------------------");
                Thread.sleep(4000);

                if(mobileName.contains("Dark Blue"))
                {
                    break;
                }
            }
        }

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
