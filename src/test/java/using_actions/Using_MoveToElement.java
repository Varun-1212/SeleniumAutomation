package using_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Using_MoveToElement {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            Actions actions=new Actions(driver);
            actions.moveToElement(driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']")))
                    .perform();
            WebElement signInButton= driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
            if(signInButton.isEnabled())
            {
                System.out.println("Sign in Button is displayed");
            }
            else
            {
                System.out.println("Sign in button is not displayed");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
