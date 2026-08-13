package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static void main(String[] args) {

        try {
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.amazon.in/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("span[id='nav-link-accountList-nav-line-1']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("ap_email_login")).sendKeys("9876543210");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[class='a-button-input']")).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
