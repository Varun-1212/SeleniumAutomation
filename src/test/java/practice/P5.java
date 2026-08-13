package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P5 {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebElement searchBox=driver.findElement(By.id("nav-search-submit-button"));
            System.out.println(searchBox.getLocation().getX());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
