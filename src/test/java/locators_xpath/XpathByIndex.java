package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathByIndex {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.get("https://www.dezlearn.com/webtable-example/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='tg']/tbody/tr[7]/td[4]/input")).click();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
