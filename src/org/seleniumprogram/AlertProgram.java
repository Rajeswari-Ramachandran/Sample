package org.seleniumprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
// Alert with OK Button
		
		WebElement alert1=driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		alert1.click();
		WebElement displayAlert1=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		displayAlert1.click();
		Alert al=driver.switchTo().alert();
		al.accept();
		
// Alert With Ok and Cancel
		
		WebElement alertOkandCancel=driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alertOkandCancel.click();
		WebElement displayAlert2=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		displayAlert2.click();
		Alert a2=driver.switchTo().alert();
		a2.accept();

// Alter With TextBox
		
		WebElement alertWithTextBox=driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alertWithTextBox.click();
		WebElement promptBox=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptBox.click();
		Alert a3=driver.switchTo().alert();
		a3.sendKeys("This is an Alter Message");
		a3.accept();
	}

}
