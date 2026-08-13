package using_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Program1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            driver.get("https://www.flipkart.com/");
            driver.switchTo().alert().getText();
            driver.switchTo().alert().dismiss();





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}