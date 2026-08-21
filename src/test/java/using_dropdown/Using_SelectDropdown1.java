package using_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class Using_SelectDropdown1 {
    public static void main(String[] args) {
        try {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://practice.expandtesting.com/dropdown");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

            select.selectByVisibleText("Option 2");


            driver.switchTo().newWindow(WindowType.TAB);

            driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Select selectMulti = new Select(driver.findElement(By.xpath("//select[@id='select-multiple-native']")));


            if (selectMulti.isMultiple()) {
                selectMulti.selectByVisibleText("Mens Casual Premium ...");

                selectMulti.selectByVisibleText("Mens Cotton Jacket...");

                selectMulti.selectByVisibleText("Solid Gold Petite Mi...");

                selectMulti.selectByVisibleText("White Gold Plated Pr...");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
