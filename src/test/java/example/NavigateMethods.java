package example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateMethods {
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.google.com");
//            Thread.sleep(2000);
//            driver.navigate().refresh(); //refreshes the page
//            Thread.sleep(2000);
//            driver.navigate().back();  //goes to previous page
//            Thread.sleep(2000);
//            driver.navigate().forward(); //goes to forward page
//            Thread.sleep(2000);

            //navigate is used for websites not having https,
            // and navigate doesn't wait for website to load completely
              driver.navigate().to("https://www.geeksforgeeks.org");
              Thread.sleep(2000);
              driver.navigate().back();
              Thread.sleep(2000);
              driver.navigate().forward();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
