package using_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClickandHold_And_Release {
    public static void main(String[] args) {
        try
        {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.get("https://yonobusiness.sbi.bank.in/");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span.ng-tns-c2785778308-3.icon-cancel"))).click();

            Actions actions=new Actions(driver);
            actions.click(driver.findElement(By.xpath("//button[.='Login']")))
                    .pause(Duration.ofSeconds(2))
                    .click(driver.findElement(By.id("loginOfmenu"))).perform();


            wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.tagName("body"))));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']"))).sendKeys("password@123");

            actions.clickAndHold(driver.findElement(By.xpath("//img[@src='assets/img/Revamp/icon_eye_close.svg']")))
                    .pause(Duration.ofSeconds(2))
                    .release()
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
