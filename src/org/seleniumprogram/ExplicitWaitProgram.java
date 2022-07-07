package org.seleniumprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	WebElement signUp=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	signUp.click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement radioButton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='_8esa'])[1]")));
	radioButton.click();
	}

}
