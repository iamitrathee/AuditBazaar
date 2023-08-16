package auditbazaar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
       
        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.get("http://10.1.4.54:3000");
     WebElement username =  driver.findElement(By.xpath("//input[@name='email']"));
     username.click();
     username.sendKeys("Userone@yopmail.com");
    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
       password.click();
       password.sendKeys("User@1234");
       driver.findElement(By.xpath("//button[@class='btn-style undefined w-100 ']")).click();

       }

    }

