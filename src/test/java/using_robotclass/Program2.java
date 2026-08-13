package using_robotclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class Program2 {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demowebshop.tricentis.com/");
            driver.switchTo().newWindow(WindowType.TAB);
            driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000);

            Robot robot=new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_TAB);

            robot.delay(2000);
            robot.mouseMove(100,200);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
