package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
    public static void main(String[] args) {

        try {
            WebDriver driver=new ChromeDriver();

            driver.get("https://deodap.in/");
            Thread.sleep(2000);

            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[id='Search-In-Modal']")).sendKeys("phone");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button[aria-label='Search']")).click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
