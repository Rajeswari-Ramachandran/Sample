package org.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("raje4u83@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("selenium");
		WebElement button=driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
	}

}
