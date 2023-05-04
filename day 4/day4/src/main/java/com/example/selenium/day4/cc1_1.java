package com.example.selenium.day4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        String cartCount = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).getText();
        
        driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        String product = "Sauce Labs Backpack";
        
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("Harith");
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("Kavish");
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("626117S");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
        
	    String str=driver.getTitle();
	    if(str.equals("Swag Labs")) {
	    	System.out.println(true);
	    }
	    else
	    	System.out.println(false);
		String str2=driver.getCurrentUrl();
		if(str2.equals("https://www.saucedemo.com/checkout-step-two.html")) {
			System.out.println(true);
		}
		else
			System.out.println(false);
        
        System.out.println("Name of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText());
        System.out.println("Price of the product: " + driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
        
    } 
}
