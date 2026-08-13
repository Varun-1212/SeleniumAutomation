package windowswitch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Switching_MultipleWindows {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demowebshop.tricentis.com/");
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://www.saucedemo.com/");
            driver.findElement(By.id("user-name")).sendKeys("hi");
            Thread.sleep(2000);
            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get("https://www.demo.web.toolsqa.com/");
            Thread.sleep(2000);

            Set<String> allPageIds = driver.getWindowHandles();
            System.out.println(allPageIds);

            for (String ele : allPageIds)
            {
                driver.switchTo().window(ele);
                Thread.sleep(2000);
                String title=driver.getTitle();
                if(title.equals("Tools QA"))
                {
                    System.out.println(driver.getTitle());
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
