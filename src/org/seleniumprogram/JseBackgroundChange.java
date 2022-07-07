package org.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JseBackgroundChange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Raje\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;

// Setting Attribute using JavaScriptExecutor
		
		WebElement loginStyle=driver.findElement(By.xpath("//button[@name='login']"));
		jse.executeScript("arguments[0].setAttribute('style','background : green;font-size : 50')", loginStyle);
		
// JavaScriptExecutor to Perform an Desired Operation on a Web Element
		
		jse.executeScript("document.getElementById('email').value='raje4u83@gmail.com';");
		jse.executeScript("document.getElementById('pass').value='password';");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		jse.executeScript("arguments[0].click();",login);
	}

}
