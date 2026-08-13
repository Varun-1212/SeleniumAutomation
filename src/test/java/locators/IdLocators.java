package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocators {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.navigate().to("https://www.amazon.in/");
            Thread.sleep(2000);
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Vivo t5 pro 5g");
            Thread.sleep(2000);
            driver.findElement(By.id("nav-search-submit-button")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("T5 Pro 5G (Glacier Blue, 8GB RAM, 256GB Storage) | 50MP Camera | 6.83\" FHD+ AMOLED Display | Snapdragon 7s Gen 4 | 9020mAh Battery")).click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
