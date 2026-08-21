package using_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingList {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

            Select select=new Select(driver.findElement(By.id("select-multiple-native")));

            List<String> desiredOptions=new ArrayList<>();

            desiredOptions.addAll(Arrays.asList("Fjallraven - Foldsac...","Mens Casual Premium ...","Mens Cotton Jacket..."));

            List<WebElement> allOptions = select.getOptions();

            for (WebElement option : allOptions)
            {
                if(desiredOptions.contains(option.getText()))
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
