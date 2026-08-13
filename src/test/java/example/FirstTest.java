package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
        String givenURL="https://chat.qspiders.com/";
        try {
            WebDriver driver= new ChromeDriver();

            //for checking url
            driver.get(givenURL);
            Thread.sleep(2000);
            String actualURL=driver.getCurrentUrl();
            if(actualURL.equals(givenURL))
            {
                System.out.println("The given URL and Actual URL is same");
            }
            else
            {
                System.out.println("The given and actual url is not same");
            }

            //For checking title
            String expectedTitle="Qtalk";
            String actualTitle=driver.getTitle();
            if(expectedTitle.equals(actualTitle)){
                System.out.println("The Title's are same");
            }
            else {
                System.out.println("The Title's are diffferent");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}
