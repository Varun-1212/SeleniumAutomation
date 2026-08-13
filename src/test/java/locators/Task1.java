package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random r=new Random();
        int value= r.nextInt(100);
        System.out.println("Random value generated : "+value);
        WebDriver driver=new ChromeDriver();
        try {

            driver.manage().window().maximize();
            driver.get("https://demowebshop.tricentis.com/");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("div.header-links a.ico-register")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#gender-male")).click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Test");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("T");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("atqi123"+value+"@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("password1234");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("password1234");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input#register-button")).click();
            Thread.sleep(4000);
            String expectedmessage="Your registration completed";
            String actualmessage;
            try {
                 actualmessage= driver.findElement(By.cssSelector("div.result")).getText();
            }
            catch(Exception e)
            {
               e.printStackTrace();
                System.out.println("Registration not Successful");
                actualmessage=null;
            }
            if (expectedmessage.equals(actualmessage)) {
                System.out.println("Registration Successful!");
                driver.findElement(By.cssSelector("a.ico-logout")).click();
                Thread.sleep(4000);
                driver.findElement(By.cssSelector("a.ico-login")).click();
                Thread.sleep(4000);
                driver.findElement(By.cssSelector("input#Email")).sendKeys("atqi123"+value+"@gmail.com");
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("input#Password")).sendKeys("password1234");
                Thread.sleep(1000);
                driver.findElement(By.cssSelector("input.button-1.login-button")).click();
            }
            else {
                System.out.println("Registration Successful!");
                System.out.println("Message doesn't match and Paused further steps");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
