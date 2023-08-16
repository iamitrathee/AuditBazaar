package auditbazaar;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Signup 
{
    public static void main(String[] args) throws InterruptedException 
    
    {
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.get("http://10.1.4.54:3000");
        driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Amit");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rathee");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("user2@yopmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Admin@123");
        driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("Admin@123");
        Thread.sleep(5000, 5000);
        String a1 = driver.getWindowHandle();
		System.out.println(a1);
		Set<String> b1 =driver.getWindowHandles();
	    System.out.println(b1);
		Iterator<String> c1 = b1.iterator();
		String Child = c1.next();
     	System.out.println(Child);
		driver.switchTo().window(Child);
        driver.findElement(By.xpath("//input[@class='form-check-input']")).click();
        driver.findElement(By.xpath("//button[@class='btn-style undefined w-100 ']")).click();
    }
}
