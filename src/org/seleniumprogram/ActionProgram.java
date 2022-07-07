package org.seleniumprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raje4\\eclipse-workspace\\SeleniumPrograms\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.greenstechnologys.com/");
		Actions obj = new Actions(driver);
		
		WebElement courses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		obj.moveToElement(courses).perform();
		WebElement dataScience=driver.findElement(By.xpath("//span[text()='Data Science Training']"));
		obj.moveToElement(dataScience).perform();
		WebElement sparkTraining =	driver.findElement(By.xpath("//span[text()='Spark Training']"));
		obj.moveToElement(sparkTraining).click().perform();
		Thread.sleep(3000);
		driver.navigate().back();
		WebElement amezonWebService=driver.findElement(By.xpath("//a[text()='Amazon Web Services(AWS)']"));
		amezonWebService.click();
		
	}

}
