package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.amazon.in/");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Boat earphones");
            Thread.sleep(2000);
            driver.findElement(By.id("nav-search-submit-button")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("h2[aria-label='Bassheads 211 Wired Earphones with 10mm Drivers, Signature Sound, in-Line Microphone, 3.5mm Jack, Voice Assistant & 120cm Cables (Raging Black)']")).click();
            Thread.sleep(8000);
            driver.get("https://www.amazon.in/boAt-Bassheads-Earphones-Signature-Microphone/dp/B0FHHKP966?th=1");
            Thread.sleep(2000);
            String price=driver.findElement(By.cssSelector("div#corePrice_feature_div span.a-price-whole")).getText();
            Thread.sleep(2000);
            System.out.println(price);
            driver.findElement(By.id("span.a-button-text.a-declarative")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("a[id='quantity_3']")).click();
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input#add-to-cart-button"));
            Thread.sleep(2000);
            String totalPrice=driver.findElement(By.cssSelector("div#sw-subtotal span.a-price-whole"))
                    .getText().replace(",","");
            int price1=Integer.parseInt(price);
            int totalPrice1=Integer.parseInt(totalPrice);

            if(price1==4*totalPrice1)
            {
                System.out.println("Total Price is correct");
            }
            else
            {
                System.out.println("Total price is not correct");
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}