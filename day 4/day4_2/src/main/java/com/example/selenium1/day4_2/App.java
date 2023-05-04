package com.example.selenium1.day4_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
	       WebDriver driver = new EdgeDriver();
	       driver.get("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
	       driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Harith");
	       driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("harith@gmail.com");
	       driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Kavish");
	       driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("kavish@gmail.com");
	       driver.findElement(By.xpath("//*[@id=\"input-theme-6\"]")).click();
	       Thread.sleep(5000);
	        JavascriptExecutor js =  (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,800)", args);
	       driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Hi da");
	       driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("1");
	       driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
	       driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
	       driver.close();
    }
}
