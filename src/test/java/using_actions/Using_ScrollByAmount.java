package using_actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Using_ScrollByAmount {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.worldometers.info/geography/flags-of-the-world/");
            Actions actions=new Actions(driver);
            actions.scrollByAmount(0,1000)
                    .pause(2)
                    .scrollByAmount(0,1000)
                    .pause(2)
                    .scrollByAmount(0,1000)
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
