//if we are having spaces in id or class
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector1 {
    public static void main(String[] args) {
        try {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.youtube.com/");
            Thread.sleep(2000);
            //If after giving space again class attribute is there again you can give dot
            driver.findElement(By.cssSelector("input.ytSearchboxComponentInput.yt-searchbox-input.title")).sendKeys("Selenium");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("button.ytSearchboxComponentSearchButton.ytSearchboxComponentSearchButtonDark")).click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
