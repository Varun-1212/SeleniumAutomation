package example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try
        {
//          driver.get("https://www.geeksforgeeks.org/");
            driver.manage().window().setSize(new Dimension(500, 300)); //sets the size of chrome
            Thread.sleep(2000);
            driver.manage().window().setPosition(new Point(100, 200));  //sets the position of chrome
            Thread.sleep(2000);
            driver.manage().window().setPosition(new Point(400, 700));
            driver.navigate().refresh();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
