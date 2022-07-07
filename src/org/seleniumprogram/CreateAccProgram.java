package org.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccProgram {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement createAcc=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAcc.click();
		Thread.sleep(3000);
		WebElement fName=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		fName.sendKeys("Raje");
		WebElement lName=driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		lName.sendKeys("Ramachandran");
		WebElement email=driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		email.sendKeys("raje83@gmail.com");
		Thread.sleep(3000);
		WebElement reEmail=driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		reEmail.sendKeys("raje83@gmail.com");
		WebElement pwd=driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pwd.sendKeys("password");
		WebElement day=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		day.sendKeys("3");
		WebElement month=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		month.sendKeys("Nov");
		WebElement year=driver.findElement(By.xpath("//select[@aria-label='Year']"));
		year.sendKeys("1983");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			

	}

}
