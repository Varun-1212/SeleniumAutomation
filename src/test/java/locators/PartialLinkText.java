package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
    public static void main(String[] args) {

        try
        {
//            1st task
//            WebDriver driver=new ChromeDriver();
//            Thread.sleep(2000);
//            driver.manage().window().maximize();
//            driver.get("https://deodap.in");
//            Thread.sleep(2000);
//            driver.findElement(By.linkText("Rakhi")).click();

//            2nd task
            WebDriver driver=new ChromeDriver();
            Thread.sleep(2000);
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://demowebshop.tricentis.com/");
            Thread.sleep(2000);
//            driver.findElement(By.linkText("Books")).click();
            driver.findElement(By.partialLinkText("Shopping cart")).click();
//            driver.findElement(By.partialLinkText("BOOKS")).click();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
