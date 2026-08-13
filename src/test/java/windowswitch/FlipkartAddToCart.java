package windowswitch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class FlipkartAddToCart {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.flipkart.com/");
            Thread.sleep(2000);
            String parentId=driver.getWindowHandle();
            System.out.println(parentId);
            driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25']"))
                    .sendKeys("samsung s26 ultra 5g");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[text()='Samsung Galaxy S26 Ultra 5G (White, 512 GB)']")).click();

            Thread.sleep(4000);

            Set<String> pageIds=driver.getWindowHandles();

            for (String s:pageIds)
            {
                if(!s.equals(parentId))
                {
                    System.out.println(s);
                    driver.switchTo().window(s);
                    break;
                }
            }

            driver.findElement(By.xpath("//div[text()='Buy now']/ancestor::div[@class='_1psv1zeb9 _1psv1ze0']/descendant::*[name()='svg']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
