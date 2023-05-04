package com.example.selenium1.day_5_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
        String url="https://www.abhibus.com/bus-ticket-booking";
        driver.get(url);
	    driver.findElement(By.xpath("//*[@id=\"source\"]")).sendKeys("Coimbatore",Keys.ENTER);
	    Thread.sleep(5000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    driver.findElement(By.xpath("//*[@id=\"destination\"]")).sendKeys("Rajapalayam");
        driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
//	    js.executeScript("arguments[0].setAttribute('value','27/04/2023')", datepicker);
    }
}
