package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingValidationMethods2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        try
        {


            driver.manage().window().maximize();
            Thread.sleep(1000);
            driver.get("https://www.naukri.com/");
            Thread.sleep(2000);
            WebElement searchButton=driver.findElement(By.xpath("//div[@class='qsbSubmit']"));
//          WebElement inputField=driver.findElement(By.xpath("//input[normalize-space(@class)='suggestor-input']"));

            if (searchButton.isEnabled())
            {
                searchButton.click();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
