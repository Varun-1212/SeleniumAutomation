package locators_relativelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingRelativeLocator {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.snapdeal.com/");
            Thread.sleep(2000);
            driver.findElement(RelativeLocator.with(By.xpath("//button[.='Download App']"))
                    .toRightOf(By.xpath("//input[@id='search-box-input']"))).click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
