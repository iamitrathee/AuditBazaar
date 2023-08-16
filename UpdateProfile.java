package auditbazaar;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateProfile 
{
    public static void main(String[] args) throws InterruptedException 
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
       Thread.sleep(5000, 5000);
        driver.findElement(By.xpath("//div[@class='auth_layout_inner_user']")).click();
        driver.findElement(By.xpath("(//a[@class='dropdown-item'])[1]")).click();
         Thread.sleep(5000, 5000);
         String a1 = driver.getWindowHandle();
		System.out.println(a1);
		Set<String> b1 =driver.getWindowHandles();
	    System.out.println(b1);
		Iterator<String> c1 = b1.iterator();
		String Child = c1.next();
     	System.out.println(Child);
		driver.switchTo().window(Child);
          Thread.sleep(5000, 5000);
       driver.findElement(By.xpath("//button[@class='btn-style bordered mw-100  ']")).click();
      /*  driver.findElement(By.xpath("//input[@class='post_input blue form-control']")).sendKeys("https://github.com/casper-ecosystem/casper-js-sdk/tree/dev/src/lib");
       driver.findElement(By.xpath("//input[@class='post_input blue2 form-control']")).sendKeys("https://www.linkedin.com/in/prity-malik-53b508285");
       driver.findElement(By.xpath("//input[@class='post_input blue3 form-control']")).sendKeys("https://t.me/Flipkart_Shopping_Loots_Deals");
       driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("0xEBbe69C972eeA190Aac44DCAa00dc92bC6d4B55f");
       driver.findElement(By.xpath("//textarea[@class='textarea form-control']")).sendKeys("Welcome to Audit Bazaar"); 
      */   
      WebElement Firstname=  driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
         Firstname.sendKeys(Keys.CONTROL + "A");
         Firstname.sendKeys(Keys.BACK_SPACE);
         Firstname.sendKeys("Amit");
       WebElement lastname =  driver.findElement(By.xpath("(//input[@class='form-control'])[3]"));
         lastname.click();
       lastname.sendKeys(Keys.CONTROL + "A");
       lastname.sendKeys(Keys.BACK_SPACE);
       lastname.sendKeys("Kumar");
       
       
          JavascriptExecutor j1 = (JavascriptExecutor) driver;
        for(int i = 10;i>=9;i++)
        j1.executeScript("window.scrollBy(0,3000)");
         Thread.sleep(5000, 8000);
          String a2 = driver.getWindowHandle();
		System.out.println(a2);
		Set<String> b2 =driver.getWindowHandles();
	    System.out.println(b2);
		Iterator<String> c2 = b2.iterator();
		String moon = c2.next();
     	System.out.println(moon);
		driver.switchTo().window(moon);
          Thread.sleep(5000, 10000);
      WebElement submit = driver.findElement(By.xpath("//button[@class='btn-style confirm_btn  ']"));
       submit.click();

    }

     
    }
