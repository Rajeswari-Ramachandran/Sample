package org.seleniumprogram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seldiff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Raje\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
			driver.switchTo().newWindow(WindowType.TAB);
			driver.navigate().to(https://www.crmpro.com/);	}

}
