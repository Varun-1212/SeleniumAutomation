package locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class XpathBySurrounding {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        try
        {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.redbus.in/buses/hyderabad-bus-tickets");
            driver.findElement(By.xpath("//i[@class='icon___a1c923 icon icon-date_range']")).click();

            for(;;)  //infinite iterations
            {
                String month= driver.findElement(By.xpath("//div[@class='monthYearHolidayWrap___8e9752']")).getText().trim();
                if (!month.equals("March 2027")) {
                    driver.findElement(By.xpath("//i[@class='icon icon-arrow arrow___0339f5 right___5fb30b ']")).click();
                    System.out.println(month);
                }
                else {
                    driver.findElement(By.xpath("//div[@class='monthArea___a525ae']/..//div[@data-date='1804098600000']"))
                            .click();  //xpath by surrounding
                    break;
                }
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
