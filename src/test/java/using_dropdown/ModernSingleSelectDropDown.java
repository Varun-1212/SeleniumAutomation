package using_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ModernSingleSelectDropDown {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
            driver.get("https://qaplayground.vercel.app/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.findElement(By.id("custom-dropdown")).click();

            List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='custom-dropdown']/descendant::div[@role='option']"));

            for (WebElement option : allOptions)
            {
                if(option.getText().contains("Selenium"))
                {
                    option.click();
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
