package org.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement scrollDown=driver.findElement(By.xpath("//a[text()='See all deals']"));
		jse.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		Thread.sleep(2000);
		WebElement scrollUp=driver.findElement(By.xpath("(//span[@class='a-size-small a-color-base truncate-2line'])[1]"));
		jse.executeScript("arguments[0].scrollIntoView(false)", scrollUp);


	}

}
