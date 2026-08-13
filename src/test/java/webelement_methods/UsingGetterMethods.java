package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetterMethods {
    public static void main(String[] args) {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(1000);

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(1000);

            WebElement registerLink = driver.findElement(By.xpath("//a[@href='/register']"));

            System.out.println(registerLink.getText());
            System.out.println(registerLink.getTagName());
            System.out.println(registerLink.getCssValue("font-size"));
            System.out.println(registerLink.getRect().getDimension());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
