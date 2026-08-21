package using_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Using_Deselect {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://qaplayground.vercel.app/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            Select s=new Select(driver.findElement(By.id("sel-skills")));

            s.selectByIndex(0);
            s.selectByIndex(1);
            s.selectByIndex(2);
            s.selectByIndex(3);

            Thread.sleep(2000);

            s.deselectAll();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
