package com.example.selenium1.day_5_2;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        String url="https://jqueryui.com/droppable/";
        driver.get(url);
        driver.manage().window().maximize();
        //JavascriptExecutor js =  (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,800)", args);
        driver.switchTo().frame(0);
        WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
        WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        Actions act=new Actions(driver);
        act.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();
        WebElement btn=driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a"));
        btn.click();
        driver.quit();
    }
}