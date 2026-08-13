package windowswitch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class M
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.amazon.in/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            Thread.sleep(2000);

            String parentId = driver.getWindowHandle();

            driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                    .sendKeys("Lava A2");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                    .click();

            Thread.sleep(2000);

            List<WebElement> allMobiles = driver.findElements(By.xpath("//div[@data-cy='title-recipe']/descendant::a/h2"));

            for(int i=0;i<=2;i++)
            {
                allMobiles.get(i).click();
                Thread.sleep(4000);
            }



            Set<String> allPageIds = driver.getWindowHandles();

            System.out.println(allPageIds);

            for(String pageId : allPageIds) {
                if (!pageId.equals(parentId)) {
                    driver.switchTo().window(pageId);

                    Thread.sleep(10000);

                    System.out.println(driver.getTitle());
                    System.out.println(pageId);

                    String mobileName = driver.findElement(By.xpath("//span[@id='productTitle']"))
                            .getText();
                    if (mobileName.contains("Dark Blue")) {
                        System.out.println(mobileName);

                        break;
                    }
                }

            }
                driver.findElement(By.xpath("//div[@class='a-box-inner']/descendant::input[@id='add-to-cart-button']"))
                        .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
