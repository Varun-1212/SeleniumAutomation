package using_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Performing_CopyPaste {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demowebshop.tricentis.com/register");

            WebElement firstNameBox= driver.findElement(By.id("FirstName"));
            WebElement lastNameBox= driver.findElement(By.id("LastName"));

            Actions actions = new Actions(driver);
            actions.click(firstNameBox)
                    //writing in firstname and pressing ctrl+A and ctrl+C
                    .sendKeys("Teja")
                    .keyDown(Keys.CONTROL)
                    .sendKeys("A")
                    .sendKeys("C")
                    .keyUp(Keys.CONTROL)

                    //pasting in lastname
                    .click(lastNameBox)
                    .keyDown(Keys.CONTROL)
                    .sendKeys("V")
                    .keyUp(Keys.CONTROL)
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
