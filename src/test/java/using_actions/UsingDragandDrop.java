package using_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingDragandDrop {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.get("https://www.timr.co/mobile-drag-drop/demo/#");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebElement oneBox=driver.findElement(By.xpath("//a[@id='one']"));
            WebElement dropBin=driver.findElement(By.xpath("//div[@id='innerBin']"));

            Actions actions=new Actions(driver);
            actions.pause(Duration.ofSeconds(2))
                    .dragAndDrop(oneBox,dropBin).perform();

            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
            WebElement dragBox=driver.findElement(By.xpath("//div[@id='draggable']"));

            actions.pause(Duration.ofSeconds(2)).
                    dragAndDropBy(dragBox,100,200)
                    .pause(Duration.ofSeconds(2))
                    .dragAndDropBy(dragBox,-100,-200)
                    .pause(Duration.ofSeconds(2))
                    .dragAndDropBy(dragBox,300,300)
                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
