package using_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Using_Scroll {
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//            driver.get("https://demowebshop.tricentis.com/");
//            Actions actions = new Actions(driver);
//            actions.scrollToElement(driver.findElement(By.xpath("//a[@href='/build-your-own-computer']/following::input[@type='button']")))
//                    .perform();
            driver.get("https://www.amazon.in/");
            Actions actions = new Actions(driver);
            actions.scrollToElement(driver.findElement(By.xpath("//div[@class='navFooterBackToTop']")))
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
