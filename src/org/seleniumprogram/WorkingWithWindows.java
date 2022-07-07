package org.seleniumprogram;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
// Getting and Printing the Window Handle of Parent Window
		
		String parent=driver.getWindowHandle();
		System.out.println("Window Handel Of The Parent : "+parent);
		
// Getting, Printing and Closing the Window Handle of Child Windows
		
		Actions obj= new Actions(driver);
		WebElement home=driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		obj.moveToElement(home).perform();
		WebElement child=driver.findElement(By.xpath("//span[text()='Sandwich Makers']"));
		obj.moveToElement(child).click().perform();

//Used Fluent Wait Instead of Thread.sleep		
	
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(20,TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		WebElement child1=wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("(//img[@class='product-image '])[4]"));
			}
		});
		child1.click();
				
				
		WebDriver childDriver=null;
		Set<String> childd1=driver.getWindowHandles();
		for (String string : childd1) 
		{
			if(!parent.equals(string))
			{
				childDriver=driver.switchTo().window(string);
			}
		}
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement scrollDown=driver.findElement(By.xpath("//div[@class='p-tile-head col-xs-3']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		WebElement child2=driver.findElement(By.xpath("//*[@id=\"pdp-seller-info-rp\"]/a[2]/div"));
		child2.click();
		int i=1;
		Set<String> childs=driver.getWindowHandles();
		for (String string : childs)
		{
			if(!parent.equals(string))
			{
				System.out.println("Window Handel of Child"+i+" : "+string);
				i++;
				childDriver=driver.switchTo().window(string);
				childDriver.close();
			}
		}
	}

}
