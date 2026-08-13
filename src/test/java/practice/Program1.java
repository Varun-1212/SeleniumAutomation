package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://demowebshop.tricentis.com/");
            List<WebElement> elements = driver.findElements(By.xpath("//a[@href]"));
            int count = 0;
            for (WebElement a : elements) {
                System.out.println(a.getText());
                count++;
            }
            System.out.println(count);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
