package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FlipkartTask {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.get("https://www.flipkart.com/");
            driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
            driver.findElement(By.xpath("//input[@class=\"nw1UBF v1zwn25\"]"))
                    .sendKeys("samsung s26 ultra 5g");
            driver.findElement(By.xpath("//button[@class=\"XFwMiH\"]")).click();
            driver.findElement(By.xpath("//div[@class='RG5Slk' and .='Samsung Galaxy S26 Ultra 5G (White, 256 GB)']"))
                    .click();

            List<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            Thread.sleep(4000);
            System.out.println(driver.getCurrentUrl());
            driver.findElement(By.xpath("//div[text()='Buy now']")).click();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
