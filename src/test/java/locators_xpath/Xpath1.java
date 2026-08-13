package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1
{

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.amazon.in/");
            Thread.sleep(2000);
            //By Single Attribute
            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                    .sendKeys("primebook Laptop");
            Thread.sleep(1000);
            //By Single Attribute
            driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
            Thread.sleep(2000);
            //By .
            driver.findElement(By.xpath("//h2[.='Primebook 2 Pro (2026) | 8GB RAM, 128GB UFS Storage | 14.1-Inch FHD IPS Display | 14 Hours Battery | MediaTek Helio G99 | Android 15 (PrimeOS 3.0) | Backlit Keyboard | in-Built AI (Gray)']"))
                    .click();
            Thread.sleep(2000);
            //By text()
            driver.findElement(By.xpath("//span[text()='Quantity:']")).click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
