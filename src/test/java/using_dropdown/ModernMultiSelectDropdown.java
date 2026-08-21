package using_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModernMultiSelectDropdown {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
            driver.get("https://demoqa.com/select-menu");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.findElement(By.xpath("//p[.='Multiselect drop down']/following::div[@class='css-b62m3t-container']")).click();

            List<String> desiredColors = new ArrayList<>();
            desiredColors.addAll(Arrays.asList("Red","Green","Blue"));

            List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='react-select-4-listbox']/div"));

            for (WebElement option : allOptions)
            {
                if(desiredColors.contains(option.getText()))
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
