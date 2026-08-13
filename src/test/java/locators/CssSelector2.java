package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2
{
    public static void main(String[] args) {
        try {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#login-button")).click();
            Thread.sleep(8000);
            driver.findElement(By.cssSelector("div.inventory_item:nth-child(1) button")).click();
            Thread.sleep(2000);
            String itemprice=driver.findElement(By.cssSelector("div.inventory_item:nth-child(1) div.inventory_item_price"))
                    .getText().replace("$","");
            driver.findElement(By.cssSelector("#shopping_cart_container")).click();
            Thread.sleep(2000);
            String priceinCart=driver.findElement(By.cssSelector("div.cart_item div.inventory_item_price"))
                    .getText().replace("$","");
            if(itemprice.equals(priceinCart))
            {
                System.out.println("The price is correct");
            }
            else
            {
                System.out.println("Price is incorrect");
            }
            
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
