package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ExcaliDraw {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://excalidraw.com/");
            WebElement line=driver.findElement(By.xpath("//button[@class='ToolIcon ToolIcon_type_toggle ToolIcon_size_medium fillable' and .='6']"));
            line.click();
            WebElement rectangle=driver.findElement(By.xpath("//button[@aria-label='Rectangle']"));

            Actions actions=new Actions(driver);
            actions
                    //drawing by line
                    .moveToElement(line,-100,150)
                 .pause(Duration.ofSeconds(1))
                    .click()
                    .moveByOffset(100,0)
                 .pause(Duration.ofSeconds(1))
                    .click()
                    .moveByOffset(0,100)
                 .pause(Duration.ofSeconds(1))
                    .click()
                    .moveByOffset(-100,0)
                 .pause(Duration.ofSeconds(1))
                    .click()
                    .moveByOffset(0,-100)
                    .click()

                    //drawing by rectangle
                    .pause(Duration.ofSeconds(1))
                    .click(rectangle)
                    .moveToElement(rectangle,-300,150)
                    .clickAndHold()
                    .moveByOffset(200,200)
                    .release()
                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
