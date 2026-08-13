package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_Action_Methods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://demowebshop.tricentis.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@class='ico-login']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='Email']"))
                    .sendKeys("hi", Keys.BACK_SPACE,"abc@gmail.com",Keys.TAB,"password123",Keys.ENTER);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
