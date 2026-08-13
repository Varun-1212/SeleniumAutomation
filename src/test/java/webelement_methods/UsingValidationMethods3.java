package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethods3 {
    public static void main(String[] args) {

    try
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.get("https://www.naukri.com/");

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='register_Layer']"))
                .click();

        Thread.sleep(2000);

        WebElement checkBox = driver.findElement(By.xpath("//a[normalize-space(@class)='checkbox-wrap']/i"));

        Thread.sleep(1000);

        System.out.println(checkBox.isSelected());
        if (!checkBox.isSelected()) {
            checkBox.click();

            Thread.sleep(1000);

        }
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }

}
}
