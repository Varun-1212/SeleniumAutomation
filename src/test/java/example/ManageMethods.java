package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethods {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.geeksforgeeks.org/");
            Thread.sleep(2000);
            driver.manage().window().maximize(); //maximizes the chrome
            Thread.sleep(2000);
            driver.manage().window().fullscreen(); //makes fullscreen
            Thread.sleep(2000);
            driver.manage().window().minimize(); //minimizes the chrome

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
