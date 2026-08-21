package using_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Using_SelectDropdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
            WebElement dropdown=driver.findElement(By.cssSelector("select#dropdown"));
            Select s=new Select(dropdown);
            s.selectByVisibleText("Option 1");
            List<WebElement> allOptions=s.getOptions();
            for (WebElement ele:allOptions)
            {
                System.out.println(ele.getText());
            }
            System.out.println(s.isMultiple());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
