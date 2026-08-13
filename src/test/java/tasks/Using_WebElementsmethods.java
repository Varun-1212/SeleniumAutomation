package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Using_WebElementsmethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://demowebshop.tricentis.com/");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='header-menu']/descendant::a[normalize-space()='Computers']"))
                    .click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@title='Show products in category Desktops']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//a[text()='Simple Computer']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@id='product_attribute_75_5_31_96']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='product_attribute_75_6_32_101']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='product_attribute_75_8_35_107']")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@id='add-to-cart-button-75']")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@class='qty-input']")).sendKeys(Keys.ARROW_RIGHT,Keys.BACK_SPACE,"10");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//input[@name='updatecart']")).click();
            Thread.sleep(2000);
            String unitPrice = driver.findElement(By.xpath("//span[@class='product-unit-price']")).getText().trim();
            String totalPrice = driver.findElement(By.xpath("//span[@class='product-subtotal']")).getText().trim();
            double unitPrice1=Double.parseDouble(unitPrice);
            double totalPrice1=Double.parseDouble(totalPrice);

            System.out.println(unitPrice1);
            System.out.println(totalPrice1);

            if(unitPrice1*10.0==totalPrice1) {
                System.out.println("Price is Correct");
            }
            else {
                System.out.println("Price is not Correct");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
