package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
    public static void main(String[] args) {
        try {
//           Task-1 Locating using Webelements table
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            Thread.sleep(2000);
//            driver.get("https://demoqa.com/webtables");
//            Thread.sleep(2000);
//            driver.findElement(By.cssSelector("table.-striped.-highlight.table.table-striped.table-bordered.table-hover>tbody>tr:nth-child(2)>td:nth-child(6)")).click();

//            Task-2 Locating using Webelements table
//            WebDriver driver = new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.get("https://demowebshop.tricentis.com/");
//            Thread.sleep(2000);
//            driver.findElement(By.cssSelector("div.header-menu a[href='/books']")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.cssSelector("div[data-productid='13'] input.button-2.product-box-add-to-cart-button")).click();
//            Thread.sleep(4000);
//            driver.findElement(By.cssSelector("div.header-links a[href='/cart']")).click();
//            Thread.sleep(2000);
//            WebElement w=driver.findElement(By.cssSelector("table.cart input[value='1']"));
//            w.clear();
//            Thread.sleep(1000);
//            w.sendKeys("12");

//            Sir's program
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://demowebshop.tricentis.com/");
            Thread.sleep(2000);
                driver.findElement(By.cssSelector("div.header-menu a[href='/books']"))
                    .click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("div[data-productid='13'] input[value='Add to cart']"))
                    .click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("a[class='ico-cart']"))
                    .click();
            Thread.sleep(2000);
            WebElement inputField  = driver.findElement(By.cssSelector("table.cart td.qty.nobr>input"));
            inputField.clear();
            Thread.sleep(1000);
            inputField.sendKeys("10");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
