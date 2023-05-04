package com.example.selenium3.day_5_3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
        String url="https://demo.guru99.com/test/delete_customer.php";
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("401",Keys.ENTER);
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        System.out.println("dismissed");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).clear();
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("402",Keys.ENTER);;
        alert.accept();
        System.out.println("accepted");
        Thread.sleep(5000);
        String str=alert.getText();
        System.out.println(str);
    }
}