package using_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MovingToElementByOffset {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.amazon.in/");
            WebElement fresh=driver.findElement(By.xpath("//a[@href='/fresh?ref_=nav_cs_grocery']"));
            Actions actions=new Actions(driver);
            //because the getLocation() points to top left corner,
            // so we have to add 1/2 width and 1/2 height of the element to move to center
            actions.moveByOffset(fresh.getLocation().getX() + fresh.getSize().getWidth()/2,
                    fresh.getLocation().getY() + fresh.getSize().getHeight()/2)
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
